package pl.edu.pwr.abis.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class RaportOcenyKoncowej {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String wyjasnienieOdrzuceniaDecyzji;

    @ManyToOne(optional = false)
    private OcenaKoncowa ocenaKoncowa;

}
