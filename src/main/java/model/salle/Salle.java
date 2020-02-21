package model.salle;

import common.DTO.SalleDTO;
import infrasctruture.DataBase;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Salle {
    private UUID salleID;
    private int numero;
    private int capacite;
    private ArrayList<LocalDateTime> joursReserves;

    private Salle(SalleDTO salleDTO) {
        this.salleID = salleDTO.getSalleID();
        this.numero = salleDTO.getNumero();
        this.capacite = salleDTO.getCapacite();
        this.joursReserves = salleDTO.getJoursReserves();
    }

    public static Salle creerSalle(SalleDTO salleDTO) throws Exception {
        if(salleDTO.getCapacite() <=0)
            throw new Exception("Les données du créneau sont érronnée");
        return new Salle(salleDTO);
    }

    public UUID getSalleID() {
        return salleID;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public ArrayList<LocalDateTime> getJoursReserves() {
        return joursReserves;
    }

    public boolean equals(Salle salle) {
        if (this.numero == salle.getNumero() && this.capacite == salle.getCapacite()) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<SalleDTO> findSalleOnDateWithCapacityNecessary(LocalDateTime dateDebutCreneau, int nbParticipant) {
        ArrayList<SalleDTO> salles = DataBase.getSalles();

        for(SalleDTO salle : salles) {
            if(salle.getCapacite() < nbParticipant || !isFree(dateDebutCreneau, salle.getJoursReserves())) {
                salles.remove(salle);
            }
        }
        return salles;
    }

    private static boolean isFree(LocalDateTime dateDebutCreneau, ArrayList<LocalDateTime> joursReserves) {
        for(LocalDateTime jourReserve : joursReserves) {
            if(dateDebutCreneau.getYear() == jourReserve.getYear()
                    && dateDebutCreneau.getMonth() == jourReserve.getMonth()
                    && dateDebutCreneau.getDayOfMonth() == jourReserve.getDayOfMonth()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBookingTimes(LocalDateTime dateDebutCreneau, Duration dureeCreneau) {
        if(dateDebutCreneau.getDayOfWeek().getValue() > 5
                || dateDebutCreneau.getHour() < 8
                || dateDebutCreneau.getHour() + dureeCreneau.toHours() > 19) {
            return false;
        }
        return true;
    }
}
