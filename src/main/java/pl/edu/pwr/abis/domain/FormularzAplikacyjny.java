package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;

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
	private Adres adresOsobyKontaktowej;
	private Adres adresWizytyStudyjnej;
	private DaneFirmy daneDoFaktury;


    @Embedded
    private ZalacznikiAplikacyjne zalacznikiAplikacyjne;


    @ManyToOne
    @JoinColumn(name = "edycja_id", nullable = false)
    private EdycjaKonkursu edycjaKonkursu;

    @OneToOne
    @JoinColumn(name = "projekt_id", unique = true, nullable = false)
    private Projekt projekt;
}
