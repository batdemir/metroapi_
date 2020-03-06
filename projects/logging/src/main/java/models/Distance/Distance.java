package models.distance;

public class Distance {
    private float id_st;
    private String station_start;
    private float id_end;
    private String station_end;
    private float distance;
    private float duration;
    private float wait;
    private float travel;

    // Getter Methods

    public float getId_st() {
        return id_st;
    }

    public String getStation_start() {
        return station_start;
    }

    public float getId_end() {
        return id_end;
    }

    public String getStation_end() {
        return station_end;
    }

    public float getDistance() {
        return distance;
    }

    public float getDuration() {
        return duration;
    }

    public float getWait() {
        return wait;
    }

    public float getTravel() {
        return travel;
    }

    // Setter Methods

    public void setId_st(float id_st) {
        this.id_st = id_st;
    }

    public void setStation_start(String station_start) {
        this.station_start = station_start;
    }

    public void setId_end(float id_end) {
        this.id_end = id_end;
    }

    public void setStation_end(String station_end) {
        this.station_end = station_end;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setWait(float wait) {
        this.wait = wait;
    }

    public void setTravel(float travel) {
        this.travel = travel;
    }
}