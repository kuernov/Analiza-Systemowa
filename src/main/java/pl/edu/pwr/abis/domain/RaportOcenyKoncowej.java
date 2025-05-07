package pl.edu.pwr.abis.domain;

public class RaportOcenyKoncowej {
    private String wyjasnienieOdrzuceniaDecyzji;

    @ManyToOne(optional = true)
    private OcenaKoncowa ocenaKoncowa;
}
