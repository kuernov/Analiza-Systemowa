package pl.edu.pwr.abis.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Uzytkownik {
    @Column(unique = true, nullable = false, updatable = false)
    protected String login;
    @Column(nullable = false)
    protected String password;
    @Column(nullable = false, updatable = false)
    protected LocalDateTime dataUtworzenia;
    @Column(nullable = false)
    protected Boolean czyAktywny;
}
