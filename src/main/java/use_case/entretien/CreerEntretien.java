package use_case.entretien;

import model.entretien.*;
import model.entretien.Profil;
import model.salle.Salle;
import use_case.salle.ReserverSalle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CreerEntretien {

    public static Entretien creerEntretien(LocalDateTime dateDebutCreneau, Duration dureeCreneau, ArrayList<Profil> participant) throws Exception {
        Salle salle = ReserverSalle.reserverSalle(dateDebutCreneau, participant.size());
        EntretienDTO entretienDTO = new EntretienDTO(dateDebutCreneau, dureeCreneau, salle, participant);
        Entretien entretien = new Entretien(entretienDTO);
        //appel pour trouver une salle
        // ajouter id salle dans entretien
        // DataBase.save(entretienDTO);
        return entretien;
    }
}
