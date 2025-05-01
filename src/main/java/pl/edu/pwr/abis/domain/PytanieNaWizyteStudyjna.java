package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class PytanieNaWizyteStudyjna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tresc;

    //trzeba jakos konkretnie zrobic not nullable?
    @ManyToMany(mappedBy = "pytania")
    private List<CzlonekJury> autorzy;

    @OneToMany
    private List<OpowiedzNaPytanie> odpowiedzi;
}
