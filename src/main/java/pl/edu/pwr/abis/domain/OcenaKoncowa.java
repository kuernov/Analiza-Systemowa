package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OcenaKoncowa extends Ocena {
	@Column(nullable = false)
    @Enumerated(EnumType.STRING)
	StatusOcenyKoncowej status;

	@OneToMany(mappedBy = "RaportOcenyKoncowej", cascade = CascadeType.REMOVE)
	private List<RaportOcenyKoncowej> raportOcenyKoncowej;

	@ManyToOne(optional = true)
	private List<Projekt> projekt;
}
