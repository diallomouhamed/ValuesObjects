package model.salle;

import common.DTO.SalleDTO;
import infrasctruture.DataBase;
import model.salle.Salle;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SalleTest{

    @Test
    public void testCreerSalle() throws Exception {
        SalleDTO salleDTO = new SalleDTO(202, 20);
        assertNotNull(Salle.creerSalle(salleDTO));

        boolean thrown = false;
        salleDTO = new SalleDTO(202, -5);

        try {
            Salle.creerSalle(salleDTO);
        } catch (Exception e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    public void testFindSalleOnDateWithCapacityNecessary() throws Exception {
        SalleDTO salleDTO = new SalleDTO(202, 10);
        LocalDateTime dateDebutCreneau = LocalDateTime.of(2020, 03, 11, 10, 00);
        ArrayList<LocalDateTime> joursReserves = new ArrayList<>();
        joursReserves.add(dateDebutCreneau);
        salleDTO.setJoursReserves(joursReserves);

        DataBase.save(salleDTO);

        /*
        int nbParticipant = 5;
        ArrayList<SalleDTO> res = Salle.findSalleOnDateWithCapacityNecessary(dateDebutCreneau, nbParticipant);
        assertTrue(res.isEmpty());

        dateDebutCreneau = LocalDateTime.of(2020, 03, 12, 10, 00);
        nbParticipant = 15;
        res = Salle.findSalleOnDateWithCapacityNecessary(dateDebutCreneau, nbParticipant);
        assertTrue(res.isEmpty());

        dateDebutCreneau = LocalDateTime.of(2020, 03, 12, 10, 00);
        nbParticipant = 5;
        res = Salle.findSalleOnDateWithCapacityNecessary(dateDebutCreneau, nbParticipant);
        assertFalse(res.isEmpty());
         */
    }
}