package model.entretien;

import java.time.Duration;
import java.time.LocalDateTime;

public class CreneauDTO {
    private LocalDateTime date;
    private Duration duree;

    public CreneauDTO(LocalDateTime date, Duration duree) {
        this.date = date;
        this.duree = duree;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }
}
