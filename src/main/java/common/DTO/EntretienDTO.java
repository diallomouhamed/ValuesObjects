package common.DTO;

import model.entretien.EntretienStatut;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class EntretienDTO {
    private UUID entretienID = UUID.randomUUID();
    private UUID salleID;
    private CreneauDTO creneau;
    private ArrayList<ProfilDTO> participants;
    private EntretienStatut entretienStatut = EntretienStatut.PLANNIFIE;

    public EntretienDTO(LocalDateTime date, Duration duree, ArrayList<ProfilDTO> participants) throws Exception {
        this.creneau = new CreneauDTO(date, duree);
        this.participants = participants;
    }

    public UUID getEntretienID() {
        return entretienID;
    }

    public void setEntretienID(UUID entretienID) {
        this.entretienID = entretienID;
    }

    public CreneauDTO getCreneau() {
        return creneau;
    }

    public void setCreneau(CreneauDTO creneau) {
        this.creneau = creneau;
    }

    public UUID getSalleID() {
        return salleID;
    }

    public void setSalleID(UUID salle) {
        this.salleID = salleID;
    }

    public ArrayList<ProfilDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<ProfilDTO> participants) {
        this.participants = participants;
    }

    public EntretienStatut getEntretienStatut() {
        return entretienStatut;
    }

    public void setEntretienStatut(EntretienStatut entretienStatut) {
        this.entretienStatut = entretienStatut;
    }
}
