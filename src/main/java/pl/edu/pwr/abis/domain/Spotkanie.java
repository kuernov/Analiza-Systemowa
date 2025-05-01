package pl.edu.pwr.abis.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Spotkanie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Embedded
    private Adres miejsce;

    @Column(nullable = false)
    private LocalDateTime termin;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypSpotkania typ;

    @ManyToOne
    @JoinColumn(name = "harmonogram_id", nullable = false)
    private Harmonogram harmonogram;

}
