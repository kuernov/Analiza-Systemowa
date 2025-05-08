package pl.edu.pwr.abis.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OcenaPEM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(nullable = false)
	private Integer liczbaPunktow;

	@Column(nullable = false)
	private String uzasadnieniePunktacji;

	@ManyToOne(optional = false)
	private Ocena ocena;
}
