package model.entretien;

import common.DTO.EntretienDTO;
import common.DTO.ProfilDTO;
import model.salle.Salle;

import java.util.ArrayList;
import java.util.UUID;

public class Entretien {
    private UUID entretienID;
    private UUID salleID;
    private Creneau creneau;
    private ArrayList<Profil> participants;
    private EntretienStatut entretienStatut;

    public Entretien(EntretienDTO entretienDTO) throws Exception {
        this.entretienID = entretienDTO.getEntretienID();
        this.creneau = Creneau.creerCreneau(entretienDTO.getCreneau());
        this.salleID = entretienDTO.getSalleID();

        ArrayList<Profil> newParticipants = new ArrayList<>();
        for(ProfilDTO participant : entretienDTO.getParticipants()) {
            newParticipants.add(new Profil(participant));
        }
        this.participants = newParticipants;

        this.entretienStatut = entretienDTO.getEntretienStatut();
    }

    public UUID getEntretienID() {
        return entretienID;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public UUID getSalleID() {
        return salleID;
    }

    public ArrayList<Profil> getParticipants() {
        return participants;
    }

    public EntretienStatut getStatut() {
        return entretienStatut;
    }

    public void setStatut(EntretienStatut entretienStatut) {
        this.entretienStatut = entretienStatut;
    }

    public boolean equals(Entretien entretien) {
        if (this.creneau == entretien.getCreneau()
                // && this.salle == entretien.getSalle()
                && this.participants.equals(entretien.getParticipants())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean peutEvaluer(ProfilDTO consultant, ProfilDTO candidat) {
        return Profil.peutEvaluer(new Profil(consultant), new Profil(candidat));
    }

    public void confirmer() {
        if(entretienStatut == EntretienStatut.PLANNIFIE)
            entretienStatut = EntretienStatut.CONFIRME;
    }

    public void annuler(String raison) {
        if (entretienStatut != EntretienStatut.ANNULE)
            entretienStatut = EntretienStatut.ANNULE;
    }

    public void planifier(Creneau creneau, Profil candidat) {}

    public void valider() {}

    public void reporter(Creneau creneau) {}
}
