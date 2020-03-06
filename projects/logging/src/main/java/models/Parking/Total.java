package models.parking;

public class Total {
    private float free;
    private float occupied;

    // Getter Methods

    public float getFree() {
        return free;
    }

    public float getOccupied() {
        return occupied;
    }

    // Setter Methods

    public void setFree(float free) {
        this.free = free;
    }

    public void setOccupied(float occupied) {
        this.occupied = occupied;
    }
}