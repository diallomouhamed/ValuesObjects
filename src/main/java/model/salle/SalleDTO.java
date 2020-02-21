package model.salle;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SalleDTO {
    private int numero;
    private int capacite;
    private ArrayList<LocalDateTime> joursReserves;

    public SalleDTO(int numero, int capacite, ArrayList<LocalDateTime> joursReserves) {
        this.numero = numero;
        this.capacite = capacite;
        this.joursReserves = joursReserves;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public ArrayList<LocalDateTime> getJoursReserves() {
        return joursReserves;
    }

    public void setJoursReserves(ArrayList<LocalDateTime> joursReserves) {
        this.joursReserves = joursReserves;
    }
}
