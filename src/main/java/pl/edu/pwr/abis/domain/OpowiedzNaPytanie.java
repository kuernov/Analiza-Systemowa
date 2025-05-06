package pl.edu.pwr.abis.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "odpowiedz_na_pytanie")
@Getter
@Setter
public class OpowiedzNaPytanie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String odpowiedz;

    @ManyToOne(optional = false)
    @JoinColumn(name = "raport_id", nullable = false)
    private RaportWizytyStudyjnej raport;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pytanie_id", nullable = false)
    private PytanieNaWizyteStudyjna pytanie;
}
