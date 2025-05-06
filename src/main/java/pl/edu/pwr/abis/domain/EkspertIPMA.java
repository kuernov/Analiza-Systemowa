package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ekspert_ipma")
@Getter
@Setter
public class EkspertIPMA extends Uzytkownik{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
	private Boolean czyZweryfikowany = true;

    @Column(nullable = false)
	private String imie;

    @Column(nullable = false)
	private String nazwisko;

    @Column(nullable = false)
	private String email;

    @OneToMany(mappedBy = "ekspertIPMA", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PropozycjaWspolpracy> propozycjeWspolpracy;

    @ManyToOne
    private Organizacja organizacja;
}
