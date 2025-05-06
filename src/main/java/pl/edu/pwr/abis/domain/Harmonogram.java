package pl.edu.pwr.abis.domain;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
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
@Table(name = "harmonogram")
@Getter
@Setter
public class Harmonogram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dataZglaszaniaAplikacji;
    private LocalDateTime dataDostarczeniaRaportuAplikacyjnego;
    private LocalDateTime DataOcenyIndywidualnej;
    private LocalDateTime DataOcenyWstepnej;
    private LocalDateTime DataRaportuZWizytyStudyjnej;
    private LocalDateTime DataOcenyKoncowej;
    private LocalDateTime dataWizytyStudyjnej;

    public Harmonogram() {
    }

    @OneToMany(mappedBy = "harmonogram", cascade = CascadeType.REMOVE)
    private List<Webinarium> webinaria = new ArrayList<>();

    @OneToMany(mappedBy = "harmonogram", cascade = CascadeType.REMOVE)
    private List<Spotkanie> spotkanie = new ArrayList<>();

}
