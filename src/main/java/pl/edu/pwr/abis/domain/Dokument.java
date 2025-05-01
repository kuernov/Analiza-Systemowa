package pl.edu.pwr.abis.domain;


import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;

@Embeddable
public class Dokument {

	String nazwa;
	LocalDateTime dataUtworzenia;
	LocalDateTime dataModyfikacji;
	String zawartosc;

}
