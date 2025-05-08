
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
