package pl.edu.pwr.abis.domain;

import jakarta.persistence.ManyToOne;

public class RaportOcenyKoncowej {

    private String wyjasnienieOdrzuceniaDecyzji;

    @ManyToOne(optional = false)
    private OcenaKoncowa ocenaKoncowa;

}
