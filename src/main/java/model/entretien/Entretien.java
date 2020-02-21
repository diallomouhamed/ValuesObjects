package model.entretien;

import model.salle.Salle;

import java.util.ArrayList;

public class Entretien {
    private EntretienID entretienID;
    private Creneau creneau;
    private Salle salle;
    private ArrayList<Profil> participant;
    private EntretienStatut entretienStatut;

    public Entretien(EntretienDTO entretienDTO) {
        this.entretienID = entretienDTO.getEntretienID();
        this.creneau = entretienDTO.getCreneau();
        this.salle = entretienDTO.getSalle();
        this.participant = entretienDTO.getParticipant();
        this.entretienStatut = entretienDTO.getEntretienStatut();
    }

    public EntretienID getEntretienID() {
        return entretienID;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public Salle getSalle() {
        return salle;
    }

    public ArrayList<Profil> getParticipant() {
        return participant;
    }

    public EntretienStatut getStatut() {
        return entretienStatut;
    }

    public void setStatut(EntretienStatut entretienStatut) {
        this.entretienStatut = entretienStatut;
    }

    public boolean equals(Entretien entretien) {
        if (this.creneau == entretien.getCreneau()
                && this.salle == entretien.getSalle()
                && this.participant == entretien.getParticipant()) {
            return true;
        } else {
            return false;
        }
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
