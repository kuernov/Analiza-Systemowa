package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DaneUczestnictwaWPPEA {

    @Column(nullable = false)
	private Integer rokKonkursu;
    @Column(nullable = false)
	private String uzyskanyTytul;

}
