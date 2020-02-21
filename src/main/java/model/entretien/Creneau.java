package model.entretien;

import java.time.Duration;
import java.time.LocalDateTime;

class Creneau {
    private LocalDateTime date;
    private Duration duree;

    private Creneau(CreneauDTO creneauDTO) {
        this.date = creneauDTO.getDate();
        this.duree = creneauDTO.getDuree();
    }

    public static Creneau creerCreneau(CreneauDTO creneauDTO) throws Exception {
        if (creneauDTO.getDuree().isNegative() || creneauDTO.getDate().getHour() < 8 || creneauDTO.getDate().getHour() + creneauDTO.getDuree().toHours() > 19)
            throw new Exception("Les données du créneau sont érronnée");
        return new Creneau(creneauDTO);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Duration getDuree() {
        return duree;
    }

    public boolean equals(Creneau creneau) {
        if (this.date == creneau.getDate() && this.duree == creneau.getDuree()) {
            return true;
        } else {
            return false;
        }
    }
}
