package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class PrzedstawicielBiuraNagrody extends Uzytkownik {
    //trzeba zrobic to derived czyAktywny

    @ManyToMany(mappedBy = "przedstawiciele")
    private List<EdycjaKonkursu> edycjeKonkursu;
}
