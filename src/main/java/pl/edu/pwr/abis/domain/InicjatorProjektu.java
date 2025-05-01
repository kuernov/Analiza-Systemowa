package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class InicjatorProjektu {

    @Column(nullable = false)
	private DaneKontaktowe daneKontaktowe;
    @Column(nullable = false)
	private Adres adres;
    @Column(nullable = false)
	private Boolean czyCzlonekIPMA;

}
