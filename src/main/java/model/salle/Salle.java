package model.salle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

public class Salle {
    private int numero;
    private int capacite;
    private ArrayList<LocalDateTime> joursReserves;

    private Salle(SalleDTO salleDTO) {
        this.numero = salleDTO.getNumero();
        this.capacite = salleDTO.getCapacite();
        this.joursReserves = salleDTO.getJoursReserves();
    }

    public static Salle creerSalle(SalleDTO salleDTO) throws Exception {
        if(salleDTO.getCapacite() <=0)
            throw new Exception("Les données du créneau sont érronnée");
        return new Salle(salleDTO);
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

}
