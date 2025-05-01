package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adres {

    @Column(nullable = false)
	private String ulica;
    @Column(nullable = false)
	private String kodPocztowyLubMiasto;
    @Column(nullable = false)
	private String wojewodztwo;
    @Column(nullable = false)
	private String kraj;

}
