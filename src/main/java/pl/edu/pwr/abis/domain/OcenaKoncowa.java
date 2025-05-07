package pl.edu.pwr.abis.domain;

@Entity
public class OcenaKoncowa extends Ocena {
	@Column(nullable = false)
    @Enumerated(EnumType.STRING)
	StatusOcenyKoncowej status;

	@ManyToOne(mappedBy = "RaportOcenyKoncowej", cascade = CascadeType.REMOVE)
	private List<RaportOcenyKoncowej> raportOcenyKoncowej;

	@OneToMany(optional = true)
	private List<Projekt> projekt;
}
