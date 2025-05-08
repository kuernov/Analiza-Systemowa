package pl.edu.pwr.abis.domain;


import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ocena {

    @Column(nullable = false)
    private Boolean czyZatwierdzona;

    @Column(nullable = false)
    private LocalDateTime planowanaDataOpracowania;

    @Transient
    public Integer lacznaLiczbaPunktow() {
        return 1;
    }

    @OneToMany(mappedBy = "Ocena", cascade = CascadeType.REMOVE)
    private List<OcenaPEM> ocenaPEM;

    @OneToOne()
    private Projekt projekt;
}
