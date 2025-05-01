package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class CzlonekJury extends Uzytkownik {
    @Column(nullable = false)
    private Boolean czyPrzewodniczacy;

    @ManyToOne
    @JoinColumn(nullable = false)
    private EdycjaKonkursu edycjaKonkursu;

    @ManyToMany
    @JoinTable(
        name = "czlonekjury_pytanie",
        joinColumns = @JoinColumn(name = "czlonekjury_id"),
        inverseJoinColumns = @JoinColumn(name = "pytanie_id")
    )
    private List<PytanieNaWizyteStudyjna> pytania;
}
