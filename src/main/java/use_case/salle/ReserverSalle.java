package use_case.salle;

import infrasctruture.DataBase;
import model.salle.Salle;
import common.DTO.SalleDTO;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class ReserverSalle {

    public static UUID reserverSalle(LocalDateTime dateDebutCreneau, Duration dureeCreneau, int nbParticipant) throws Exception {
        if(Salle.isBookingTimes(dateDebutCreneau, dureeCreneau)) {
            throw new Exception("Impossible de réserver une salle pour ces horaires");
        }

        ArrayList<SalleDTO> sallesDTO = Salle.findSalleOnDateWithCapacityNecessary(dateDebutCreneau, nbParticipant);

        SalleDTO salleMinimale = null;

        for(SalleDTO salle : sallesDTO) {
            if(salleMinimale == null || salleMinimale.getCapacite() > salle.getCapacite())
                salleMinimale = salle;
        }

        ArrayList<LocalDateTime> array = salleMinimale.getJoursReserves();
        array.add(dateDebutCreneau);
        salleMinimale.setJoursReserves(array);
        DataBase.save(salleMinimale);
        return salleMinimale.getSalleID();
    }
}
