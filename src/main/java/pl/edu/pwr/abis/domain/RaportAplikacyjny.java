package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RaportAplikacyjny {
    @Column(nullable = false)
    private Boolean czyZatwierdzony = false;
}
