package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class FormularzAplikacyjny {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	private LocalDateTime dataZlozenia;
	private DaneKontaktowe daneOsobyKontaktowej;
    @AttributeOverrides({
        @AttributeOverride(name = "ulica", column = @Column(name = "osoba_kontaktowa_ulica")),
        @AttributeOverride(name = "kodPocztowyLubMiasto", column = @Column(name = "osoba_kontaktowa_kod_pocztowy_lub_miasto")),
        @AttributeOverride(name = "wojewodztwo", column = @Column(name = "osoba_kontaktowa_wojewodztwo")),
        @AttributeOverride(name = "kraj", column = @Column(name = "osoba_kontaktowa_kraj"))
    })
    private Adres adresOsobyKontaktowej;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "ulica", column = @Column(name = "adres_wizyty_ulica")),
        @AttributeOverride(name = "kodPocztowyLubMiasto", column = @Column(name = "adres_wizyty_kod_pocztowy_lub_miasto")),
        @AttributeOverride(name = "wojewodztwo", column = @Column(name = "adres_wizyty_wojewodztwo")),
        @AttributeOverride(name = "kraj", column = @Column(name = "adres_wizyty_kraj"))
    })
    private Adres adresWizytyStudyjnej;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nazwa", column = @Column(name = "firma_nazwa")),
        @AttributeOverride(name = "ulicaNumer", column = @Column(name = "firma_ulica_numer")),
        @AttributeOverride(name = "kodPocztowyLubMiasto", column = @Column(name = "firma_kod_pocztowy_lub_miasto")),
        @AttributeOverride(name = "numerNIP", column = @Column(name = "firma_nip"))
    })
	private DaneFirmy daneDoFaktury;


    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "film.nazwa", column = @Column(name = "film_nazwa")),
        @AttributeOverride(name = "film.rozmiar", column = @Column(name = "film_rozmiar")),
        @AttributeOverride(name = "film.rozszerzenie", column = @Column(name = "film_rozszerzenie")),
        @AttributeOverride(name = "logotyp.nazwa", column = @Column(name = "logotyp_nazwa")),
        @AttributeOverride(name = "logotyp.rozmiar", column = @Column(name = "logotyp_rozmiar")),
        @AttributeOverride(name = "logotyp.rozszerzenie", column = @Column(name = "logotyp_rozszerzenie")),
        @AttributeOverride(name = "listPolecajacy.nazwa", column = @Column(name = "list_polecajacy_nazwa")),
        @AttributeOverride(name = "listPolecajacy.rozmiar", column = @Column(name = "list_polecajacy_rozmiar")),
        @AttributeOverride(name = "listPolecajacy.rozszerzenie", column = @Column(name = "list_polecajacy_rozszerzenie")),
        @AttributeOverride(name = "oswiadczenie.nazwa", column = @Column(name = "oswiadczenie_nazwa")),
        @AttributeOverride(name = "oswiadczenie.rozmiar", column = @Column(name = "oswiadczenie_rozmiar")),
        @AttributeOverride(name = "oswiadczenie.rozszerzenie", column = @Column(name = "oswiadczenie_rozszerzenie")),
        @AttributeOverride(name = "oswiadczenieInicjatora.nazwa", column = @Column(name = "oswiadczenie_inicjatora_nazwa")),
        @AttributeOverride(name = "oswiadczenieInicjatora.rozmiar", column = @Column(name = "oswiadczenie_inicjatora_rozmiar")),
        @AttributeOverride(name = "oswiadczenieInicjatora.rozszerzenie", column = @Column(name = "oswiadczenie_inicjatora_rozszerzenie"))
    })
    private ZalacznikiAplikacyjne zalacznikiAplikacyjne;


    @ManyToOne
    @JoinColumn(name = "edycja_id", nullable = false)
    private EdycjaKonkursu edycjaKonkursu;

    @OneToOne
    @JoinColumn(name = "projekt_id", unique = true, nullable = false)
    private Projekt projekt;
}
