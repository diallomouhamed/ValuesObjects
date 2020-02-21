package model.entretien;

import java.util.List;

public class Profil {
    private String nom;
    private String prenom;
    private List<Specialite> specialite;
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

    public List<Specialite> getSpecialite() {
        return specialite;
    }

    public int getNbAnneeExp() {
        return nbAnneeExp;
    }

    public ProfilStatut getProfilStatut() {
        return profilStatut;
    }
}
