package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "organizacja")
@Getter
@Setter
public class Organizacja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    @Column(nullable = false)
	private Adres adres;

    @Column(nullable = false, unique = true)
	private String numerNIP;

    @Column(nullable = false)
	private String nazwa;

    @Column(nullable = false)
	private Boolean czyZweryfikowany;

    @OneToMany(mappedBy = "organizacja")
    private List<EkspertIPMA> eksperci;

    @OneToMany(mappedBy = "organizacja")
    private List<Aplikant> aplikanci;

    public Organizacja() {
    }
}
