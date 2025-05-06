package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "propozycja_wspolpracy")
@Getter
@Setter
public class PropozycjaWspolpracy {
    @EmbeddedId
    private PropozycjaWspolpracyId id;

    @Column(nullable = false)
    private Boolean czyAsesorWiodacy;

    @Enumerated(EnumType.STRING)
	private StatusPropozycji statusPropozycji;

	private LocalDateTime dataZlozenia;

    @ManyToOne
    @MapsId("ekspertIPMAId")
    private EkspertIPMA ekspertIPMA;

    @ManyToOne
    @MapsId("projekt")
    private Projekt projekt;
}
