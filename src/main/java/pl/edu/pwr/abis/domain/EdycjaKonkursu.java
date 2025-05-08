package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;
import java.util.*;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
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
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EdycjaKonkursu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, updatable = false, unique = true)
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

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nazwa", column = @Column(name = "lista_finalistow_nazwa")),
        @AttributeOverride(name = "dataUtworzenia", column = @Column(name = "lista_finalistow_data_utworzenia")),
        @AttributeOverride(name = "dataModyfikacji", column = @Column(name = "lista_finalistow_data_modyfikacji")),
        @AttributeOverride(name = "zawartosc", column = @Column(name = "lista_finalistow_zawartosc"))
    })
    private Dokument listaFinalistow;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nazwa", column = @Column(name = "ulotka_nazwa")),
        @AttributeOverride(name = "dataUtworzenia", column = @Column(name = "ulotka_data_utworzenia")),
        @AttributeOverride(name = "dataModyfikacji", column = @Column(name = "ulotka_data_modyfikacji")),
        @AttributeOverride(name = "zawartosc", column = @Column(name = "ulotka_zawartosc"))
    })
    private Dokument ulotka;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nazwa", column = @Column(name = "regulamin_nazwa")),
        @AttributeOverride(name = "dataUtworzenia", column = @Column(name = "regulamin_data_utworzenia")),
        @AttributeOverride(name = "dataModyfikacji", column = @Column(name = "regulamin_data_modyfikacji")),
        @AttributeOverride(name = "zawartosc", column = @Column(name = "regulamin_zawartosc"))
    })
    private Dokument regulamin;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nazwa", column = @Column(name = "wyniki_konkursu_nazwa")),
        @AttributeOverride(name = "dataUtworzenia", column = @Column(name = "wyniki_konkursu_data_utworzenia")),
        @AttributeOverride(name = "dataModyfikacji", column = @Column(name = "wyniki_konkursu_data_modyfikacji")),
        @AttributeOverride(name = "zawartosc", column = @Column(name = "wyniki_konkursu_zawartosc"))
    })
    private Dokument wynikiKonkursu;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Harmonogram harmonogram;

    @OneToMany(mappedBy = "edycjaKonkursu", cascade = CascadeType.REMOVE)
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
