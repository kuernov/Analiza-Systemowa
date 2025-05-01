package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class PrzedstawicielOrganizacji extends Uzytkownik {

    @Column(nullable = false)
    private DaneKontaktowe dane;

    @ManyToOne
    @JoinColumn(name = "aplikant_id", nullable = false)
    private Aplikant aplikant;
}
