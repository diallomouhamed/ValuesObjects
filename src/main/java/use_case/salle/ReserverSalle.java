package use_case.salle;

import model.salle.Salle;
import model.salle.SalleDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReserverSalle {

    public static Salle reserverSalle(LocalDateTime dateDebutCreneau, int nbParticipant) throws Exception {
        SalleDTO salleDTO = null;   // SalleDTO.findSalleWithCapacity(nbParticipant);
        ArrayList<LocalDateTime> array = salleDTO.getJoursReserves();
        array.add(dateDebutCreneau);
        salleDTO.setJoursReserves(array);
        return Salle.creerSalle(salleDTO);
    }
}
