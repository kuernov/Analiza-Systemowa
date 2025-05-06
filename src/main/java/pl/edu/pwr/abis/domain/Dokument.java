package pl.edu.pwr.abis.domain;


import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;

@Embeddable
public class Dokument {
	private String nazwa;
    private LocalDateTime dataUtworzenia;
    private LocalDateTime dataModyfikacji;
    private String zawartosc;
}
