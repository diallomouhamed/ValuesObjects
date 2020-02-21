package model.entretien;

import model.salle.Salle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class EntretienDTO {
    private EntretienID entretienID = new EntretienID();
    private Creneau creneau;
    private Salle salle;
    private ArrayList<Profil> participant;
    private EntretienStatut entretienStatut = EntretienStatut.PLANNIFIE;

    public EntretienDTO(LocalDateTime date, Duration duree, Salle salle, ArrayList<Profil> participant) throws Exception {
        this.creneau = Creneau.creerCreneau(new CreneauDTO(date, duree));
        this.salle = salle;
        this.participant = participant;
    }

    public EntretienID getEntretienID() {
        return entretienID;
    }

    public void setEntretienID(EntretienID entretienID) {
        this.entretienID = entretienID;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public ArrayList<Profil> getParticipant() {
        return participant;
    }

    public void setParticipant(ArrayList<Profil> participant) {
        this.participant = participant;
    }

    public EntretienStatut getEntretienStatut() {
        return entretienStatut;
    }

    public void setEntretienStatut(EntretienStatut entretienStatut) {
        this.entretienStatut = entretienStatut;
    }
}
