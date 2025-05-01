package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DaneFirmy {

    @Column(nullable = false)
	private String nazwa;
    @Column(nullable = false)
	private String ulicaNumer;
    @Column(nullable = false)
	private String kodPocztowyLubMiasto;
    @Column(nullable = false)
	private Integer numerNIP;

}
