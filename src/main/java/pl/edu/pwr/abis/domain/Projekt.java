package pl.edu.pwr.abis.domain;

import static pl.edu.pwr.abis.domain.StatusProjektu.rozpatrywany;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKey;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Projekt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
	private String nazwa;

    @Column(nullable = false)
	private Float budzet;

    @Column(nullable = false)
	private Boolean czyUkonczony;

    @Column(nullable = false)
	private String opis;
    @Column(nullable = false)
	private Boolean czyZgodnyZICB4;

    @Column(nullable = false)
	private Boolean czyDostepnyDoPublikacji;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusProjektu status = rozpatrywany;

    @Column(nullable = false)
    private Boolean czyOplacony;

    private String powodOdrzucenia;

    @Embedded
    private RaportAplikacyjny raportAplikacyjny;

    @ManyToOne
    @JoinColumn(name = "kategoria_id")
    private Kategoria kategoria;

    @ManyToOne
    @JoinColumn(name = "aplikant_id", nullable = false)
    private Aplikant aplikant;

    @OneToOne(mappedBy = "projekt", cascade = CascadeType.REMOVE)
    private FormularzAplikacyjny formularzAplikacyjny;

    @OneToMany(mappedBy = "projekt", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PropozycjaWspolpracy> propozycjeWspolpracy;

    @OneToMany(mappedBy = "projekt")
    @MapKey(name = "projekt.nazwa") // nie wiem czy to działa - w przykładach nie ma przypadku z many-many?
    private Set<OcenaIndywidualna> ocenyIndywidualne = new HashSet<>();

    @ManyToOne(mappedBy = "projekt", cascade = CascadeType.REMOVE, optional = true)
    private OcenaKoncowa ocenaKoncowa;
}
