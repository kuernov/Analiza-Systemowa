package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Embeddable
public class ZalacznikiAplikacyjne {
    @ElementCollection(fetch = FetchType.EAGER)
    @Column(nullable = false)
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
