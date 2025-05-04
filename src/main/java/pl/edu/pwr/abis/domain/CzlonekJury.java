package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "czlonek_jury")
@Getter
@Setter
public class CzlonekJury extends Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    @Override
    public Boolean getCzyAktywny() {
        if (edycjaKonkursu != null) {
            return "aktualna".equalsIgnoreCase(edycjaKonkursu.getStatusEdycji().toString());
        }
        return false;
    }
}
