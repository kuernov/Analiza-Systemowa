package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DaneKontaktowe {
    @Column(nullable = false)
	private String imie;
    @Column(nullable = false)
    private String nazwisko;
    @Column(nullable = false)
	private String telefon;
    @Column(nullable = false)
	private String email;
}
