package pl.edu.pwr.abis.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class PropozycjaWspolpracyId implements Serializable {
    private Integer projektId;
    private Integer ekspertIPMAId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropozycjaWspolpracyId that = (PropozycjaWspolpracyId) o;
        return Objects.equals(projektId, that.projektId) && Objects.equals(ekspertIPMAId, that.ekspertIPMAId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projektId, ekspertIPMAId);
    }
}
