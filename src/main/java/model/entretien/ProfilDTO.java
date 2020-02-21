package model.entretien;

import model.entretien.ProfilStatut;
import model.entretien.Specialite;

import java.util.List;

public class ProfilDTO {
    private String nom;
    private String prenom;
    private List<Specialite> specialite;
    private int nbAnneeExp;
    private ProfilStatut profilStatut;

    public ProfilDTO(String nom, String prenom, List<Specialite> specialite, int nbAnneeExp, ProfilStatut profilStatut) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.nbAnneeExp = nbAnneeExp;
        this.profilStatut = profilStatut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Specialite> getSpecialite() {
        return specialite;
    }

    public void setSpecialite(List<Specialite> specialite) {
        this.specialite = specialite;
    }

    public int getNbAnneeExp() {
        return nbAnneeExp;
    }

    public void setNbAnneeExp(int nbAnneeExp) {
        this.nbAnneeExp = nbAnneeExp;
    }

    public ProfilStatut getProfilStatut() {
        return profilStatut;
    }

    public void setProfilStatut(ProfilStatut profilStatut) {
        this.profilStatut = profilStatut;
    }
}
