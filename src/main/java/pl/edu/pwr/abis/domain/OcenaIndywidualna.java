package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ocena_indywidualna")
@Getter
@Setter
public class OcenaIndywidualna {

    @EmbeddedId
    private OcenaIndywidualnaId id;

    @Column(nullable = false)
    private LocalDateTime planowanaDataOpracowania;

    @Column(nullable = false)
	private Boolean czyZatwierdzona = false;

	private String ocena;

    @ManyToOne
    @MapsId("projektId")
    private Projekt projekt;

    @ManyToOne
    @MapsId("asesorId")
    private Asesor asesor;

    public OcenaIndywidualna() {
    }
}
