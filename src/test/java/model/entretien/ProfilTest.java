package model.entretien;

import common.DTO.ProfilDTO;
import model.entretien.Profil;
import model.entretien.ProfilStatut;
import model.entretien.Specialite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfilTest {

    @Test
    public void testPeutEvaluer() {
        ProfilDTO consultant = new ProfilDTO("Paul", "Dupont", Specialite.JAVA, 5, ProfilStatut.CONSULTANT);
        ProfilDTO candidat = new ProfilDTO("Jean", "Chevalier", Specialite.JAVA, 3, ProfilStatut.CANDIDAT);
        Assertions.assertTrue(Profil.peutEvaluer(new Profil(consultant), new Profil(candidat)));

        consultant = new ProfilDTO("Paul", "Dupont", Specialite.JAVA, 5, ProfilStatut.CONSULTANT);
        candidat = new ProfilDTO("Jean", "Chevalier", Specialite.JAVA, 8, ProfilStatut.CANDIDAT);
        assertFalse(Profil.peutEvaluer(new Profil(consultant), new Profil(candidat)));

        consultant = new ProfilDTO("Paul", "Dupont", Specialite.JAVA, 5, ProfilStatut.CONSULTANT);
        candidat = new ProfilDTO("Jean", "Chevalier", Specialite.C, 3, ProfilStatut.CANDIDAT);
        assertFalse(Profil.peutEvaluer(new Profil(consultant), new Profil(candidat)));
    }
}