package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "przedstawiciel_biura_nagrody")
@Getter
@Setter
public class PrzedstawicielBiuraNagrody extends Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany(mappedBy = "przedstawicieleBiuraNagrody")
    private List<EdycjaKonkursu> edycjeKonkursu;

    @Override
    public Boolean getCzyAktywny() {
        if (edycjeKonkursu != null) {
            return edycjeKonkursu.stream()
                .anyMatch(e -> "aktualna".equalsIgnoreCase(e.getStatusEdycji().toString()));
        }
        return false;
    }
}
