package use_case.entretien;

import common.DTO.EntretienDTO;
import common.DTO.ProfilDTO;
import infrasctruture.DataBase;
import model.entretien.*;
import model.salle.Salle;
import use_case.salle.ReserverSalle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class CreerEntretien {

    public static Entretien creerEntretien(LocalDateTime dateDebutCreneau, Duration dureeCreneau, ArrayList<ProfilDTO> participants) throws Exception {
        UUID salleID = ReserverSalle.reserverSalle(dateDebutCreneau, dureeCreneau, participants.size());

        ProfilDTO consultant = null;
        ProfilDTO candidat = null;

        for (ProfilDTO participant : participants) {
            if(participant.getProfilStatut() == ProfilStatut.CONSULTANT)
                consultant = participant;
            if(participant.getProfilStatut() == ProfilStatut.CANDIDAT)
                candidat = participant;
        }

        if(consultant == null || candidat == null || !Entretien.peutEvaluer(consultant, candidat)) {
            throw new Exception("Le consultant ne peut pas évaluer le candidat");
        }

        EntretienDTO entretienDTO = new EntretienDTO(dateDebutCreneau, dureeCreneau, participants);
        entretienDTO.setSalleID(salleID);
        Entretien entretien = new Entretien(entretienDTO);
        DataBase.save(entretienDTO);
        return entretien;
    }
}
