package model.entretien;

import common.DTO.ProfilDTO;

import java.util.List;

class Profil {
    private String nom;
    private String prenom;
    private Specialite specialite;
    private int nbAnneeExp;
    private ProfilStatut profilStatut;

    public Profil(ProfilDTO profilDTO) {
        this.nom = profilDTO.getNom();
        this.prenom = profilDTO.getPrenom();
        this.specialite = profilDTO.getSpecialite();
        this.nbAnneeExp = profilDTO.getNbAnneeExp();
        this.profilStatut = profilDTO.getProfilStatut();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public int getNbAnneeExp() {
        return nbAnneeExp;
    }

    public ProfilStatut getProfilStatut() {
        return profilStatut;
    }

    public static boolean peutEvaluer(Profil consultant, Profil candidat) {
        if(consultant.getSpecialite() != candidat.getSpecialite()
            || consultant.getNbAnneeExp() <= candidat.getNbAnneeExp()) {
            return false;
        }
        return true;
    }
}
