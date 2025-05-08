package pl.edu.pwr.abis.domain;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "raport_wizyty_studyjnej")
@Getter
@Setter
public class RaportWizytyStudyjnej {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
	private Dokument zalaczniki;

    @OneToMany(mappedBy = "raport", cascade = CascadeType.REMOVE)
    private List<OpowiedzNaPytanie> odpowiedzi;

    @OneToOne()
    private Projekt projekt;
}
