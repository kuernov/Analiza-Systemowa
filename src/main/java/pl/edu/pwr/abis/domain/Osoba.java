package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Osoba {
    @Column(nullable = false)
    private DaneKontaktowe daneKontaktowe;
}
