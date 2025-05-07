package pl.edu.pwr.abis.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class OcenaIndywidualnaId implements Serializable {
    private Integer projektId;
    private Integer asesorId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OcenaIndywidualnaId that = (OcenaIndywidualnaId) o;
        return Objects.equals(projektId, that.projektId) && Objects.equals(asesorId, that.asesorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projektId, asesorId);
    }
}
