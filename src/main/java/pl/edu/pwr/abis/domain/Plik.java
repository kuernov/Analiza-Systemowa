package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Plik {
    @Column(nullable = false)
	private String nazwa;
    @Column(nullable = false)
	private Float rozmiar;
    @Column(nullable = false)
	private String rozszerzenie;

}
