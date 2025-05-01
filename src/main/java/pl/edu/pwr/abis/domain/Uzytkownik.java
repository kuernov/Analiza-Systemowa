package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Uzytkownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, updatable = false)
    private LocalDateTime dataUtworzenia;
    @Column(nullable = false)
    private Boolean czyAktywny;
    @Column(nullable = false)
    private Boolean czyAdministrator;


}
