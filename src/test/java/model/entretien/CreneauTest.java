package model.entretien;

import model.entretien.Creneau;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CreneauTest {

    private LocalDateTime date = null;
    private Duration duree = null;
    private Creneau creneau = null;

    @Test
    public void testCreneau() {
        date = LocalDateTime.of(2020, 03, 11, 10, 00);
        duree = Duration.ofHours(2);

        try {
            creneau = new Creneau(date, duree);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assertNotNull(creneau);
        assertEquals(creneau.getDate(), date);
        assertEquals(creneau.getDuree(), duree);
    }

    @Test
    public void testCreneauEnDehorsDesHeuresDeBureau() {
        date = LocalDateTime.of(2020, 3, 11, 5, 0);
        duree = Duration.ofHours(2);

        try {
            creneau = new Creneau(date, duree);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assertNull(creneau);
    }
}