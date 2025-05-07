
@Entity
public class Ocena {
    private Boolean czyZatwierdzona;
    private LocalDateTime planowanaDataOpracowania;

    public Integer lacznaLiczbaPunktow() {
        return 1;
    }

    //todo: OcenaKryteriumPEM
}
