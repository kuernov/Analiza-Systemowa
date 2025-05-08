package pl.edu.pwr.abis.domain;

@Entity
@Getter
@Setter
public class OcenaPEM {

	@Column(nullable = false)
	private Integer liczbaPunktow;
	
	@Column(nullable = false)
	private String uzasadnieniePunktacji;

	@ManyToOne(optional = false)
	private Ocena ocena;
}
