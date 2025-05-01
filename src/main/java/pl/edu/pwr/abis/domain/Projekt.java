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

}
