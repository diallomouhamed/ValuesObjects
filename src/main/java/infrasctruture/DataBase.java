package infrasctruture;

import common.DTO.EntretienDTO;
import common.DTO.ProfilDTO;
import common.DTO.SalleDTO;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<EntretienDTO> entretiens = new ArrayList<>();
    public static ArrayList<ProfilDTO> profils = new ArrayList<>();
    public static ArrayList<SalleDTO> salles = new ArrayList<>();

    public static void save(EntretienDTO entretien) {
        entretiens.add(entretien);
    }

    public static void save(ProfilDTO profil) {
        // Verifier si l'objet existe deja
        // Si oui modifier l'existant
        // Si non sauvegarder simplement
        profils.add(profil);
    }

    public static void save(SalleDTO salle) {
        // Verifier si l'objet existe deja
        // Si oui modifier l'existant
        // Si non sauvegarder simplement
        salles.add(salle);
    }

    public static ArrayList<EntretienDTO> getEntretiens() {
        // Verifier si l'objet existe deja
        // Si oui modifier l'existant
        // Si non sauvegarder simplement
        return entretiens;
    }

    public static ArrayList<ProfilDTO> getProfils() {
        return profils;
    }

    public static ArrayList<SalleDTO> getSalles() {
        return salles;
    }
}
