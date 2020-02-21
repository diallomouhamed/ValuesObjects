package common.DTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class SalleDTO {
    private UUID salleID = UUID.randomUUID();
    private int numero;
    private int capacite;
    private ArrayList<LocalDateTime> joursReserves = new ArrayList<>();

    public SalleDTO(int numero, int capacite) {
        this.numero = numero;
        this.capacite = capacite;
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

    public UUID getSalleID() {
        return salleID;
    }

    public void setSalleID(UUID salleID) {
        this.salleID = salleID;
    }
}
