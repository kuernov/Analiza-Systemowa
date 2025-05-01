package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;
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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class EdycjaKonkursu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, updatable = false) //czy readOnly tak ma być?
    private Integer numerEdycji;


    @Column(nullable = false)
    private String nazwa;

    @Column(nullable = false)
    private Integer kosztUczestnictwa;

    @Column(nullable = false)
    private Integer minimalnyCzasTrwania;

    @Column(nullable = false)
    private Integer minimalnaLiczbaCzlonkow;

    @Column(nullable = false)
    private Integer minimalnaLiczbaPodwykonawcow;

    @Column(nullable = false)
    private Float znizka;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusEdycji statusEdycji;

    private Dokument listaFinalistow;
	private Dokument ulotka;
	private Dokument regulamin;
	private Dokument wynikiKonkursu;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Harmonogram harmonogram;

    @OneToMany(mappedBy = "edycja", cascade = CascadeType.REMOVE)
    private Set<Kategoria> kategorie;

    @OneToMany
    private List<FormularzAplikacyjny> formularze;

    @ManyToMany
    @JoinTable(
        name = "edycja_przedstawiciel",
        joinColumns = @JoinColumn(name = "edycja_id"),
        inverseJoinColumns = @JoinColumn(name = "przedstawiciel_id")
    )
    private List<PrzedstawicielBiuraNagrody> przedstawicieleBiuraNagrody;

    @OneToMany(mappedBy = "edycjaKonkursu")
    private List<CzlonekJury> czlonkowieJury;



}
