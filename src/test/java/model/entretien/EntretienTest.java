package model.entretien;

import model.salle.Salle;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

class EntretienTest {

    Creneau creneau = null;
    Salle salle = null;

    @Test
    public void testEntretien() {
        /*
        try {
            creneau = new Creneau(LocalDateTime.of(2020, 3, 11, 14, 30), Duration.ofHours(2));
            salle = new Salle(1, 110, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         */
        String [] participant = new String[10];

        /*
        Entretien entretien = new Entretien(creneau, salle, participant);

        assertNotNull(entretien);
        assertEquals(entretien.getCreneau(), creneau);
        assertEquals(entretien.getSalle(), salle);
        assertEquals(entretien.getParticipant(), participant);
        assertEquals(entretien.getStatut(), EntretienStatut.PLANNIFIE);
        */
    }

    @Test
    public void testConfirmer() {
        /*
        try {
            creneau = new Creneau(LocalDateTime.now(), Duration.ofHours(2));
            salle = new Salle(1, 110, 10);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
         */
        String [] participant = new String[10];

        /*
        Entretien entretien = new Entretien(creneau, salle, participant);

        entretien.setStatut(EntretienStatut.PLANNIFIE);
        entretien.confirmer();
        assertEquals(entretien.getStatut(), EntretienStatut.CONFIRMER);

        entretien.setStatut(EntretienStatut.CONFIRMER);
        entretien.confirmer();
        assertEquals(entretien.getStatut(), EntretienStatut.CONFIRMER);

        entretien.setStatut(EntretienStatut.ANNULLER);
        entretien.confirmer();
        assertEquals(entretien.getStatut(), EntretienStatut.ANNULLER);
         */
    }

    @Test
    public void testAnnuler() {
        /*
        try {
            creneau = new Creneau(LocalDateTime.now(), Duration.ofHours(2));
            salle = new Salle(1, 110, 10);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
         */
        String [] participant = new String[10];

        /*
        Entretien entretien = new Entretien(creneau, salle, participant);

        entretien.setStatut(EntretienStatut.PLANNIFIE);
        entretien.annuler("Voici une raison.");
        assertEquals(entretien.getStatut(), EntretienStatut.ANNULLER);

        entretien.setStatut(EntretienStatut.CONFIRMER);
        entretien.annuler("Voici une raison.");
        assertEquals(entretien.getStatut(), EntretienStatut.ANNULLER);

        entretien.setStatut(EntretienStatut.ANNULLER);
        entretien.annuler("Voici une raison.");
        assertEquals(entretien.getStatut(), EntretienStatut.ANNULLER);
         */
    }
}