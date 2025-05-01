package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Aplikant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
	private String email;
    @Column(nullable = false)
	private String nazwa;
    @Column(nullable = false)
	private Adres adres;
    @Column(nullable = false)
	private DaneZarzadzajacegoAplikantem daneZarzadzajacego;
    @Column(nullable = false)
	private Boolean czyCzlonekIPMA;
    @Column(nullable = false)
	private DaneUczestnictwaWPPEA daneWczesniejszegoUczestnictwa;

    @OneToMany(mappedBy = "aplikant", cascade = CascadeType.REMOVE)
    @Column(nullable = false)
    private List<PrzedstawicielOrganizacji> przedstawicieleOrganizacji;

    @OneToMany(mappedBy = "aplikant", cascade = CascadeType.REMOVE)
    private List<Projekt> projekty;

    @ManyToOne
    @JoinColumn(name = "edytor_id", nullable = false)
    private SystemKsiegowy systemKsiegowy;

}
