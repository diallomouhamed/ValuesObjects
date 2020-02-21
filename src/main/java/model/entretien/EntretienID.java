package model.entretien;

import java.util.UUID;

class EntretienID {
    private UUID uuid;

    public EntretienID() {
        uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }
}
