package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Embeddable
public class ZalacznikiAplikacyjne {
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "formularz_aplikacyjny_zdjecia", joinColumns = @JoinColumn(name = "formularz_aplikacyjny_id"))
    @AttributeOverrides({
        @AttributeOverride(name = "nazwa", column = @Column(name = "zdjecie_nazwa")),
        @AttributeOverride(name = "rozmiar", column = @Column(name = "zdjecie_rozmiar")),
        @AttributeOverride(name = "rozszerzenie", column = @Column(name = "zdjecie_rozszerzenie"))
    })
    private List<Plik> zdjecia = new ArrayList<>();
    @Column(nullable = false)
	private Plik film;
    @Column(nullable = false)
	private Plik logotyp;
    @Column(nullable = false)
	private Plik listPolecajacy;
    @Column(nullable = false)
	private Plik oswiadczenie;
    @Column(nullable = false)
	private Plik oswiadczenieInicjatora;
}
