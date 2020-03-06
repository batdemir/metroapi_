package models.location;

public class Location {
    private float id;
    private String station;
    private float lat;
    private float lang;
    private String station_type;
    private boolean tramway;
    private boolean izban;

    // Getter Methods

    public float getId() {
        return id;
    }

    public String getStation() {
        return station;
    }

    public float getLat() {
        return lat;
    }

    public float getLang() {
        return lang;
    }

    public String getStation_type() {
        return station_type;
    }

    public boolean getTramway() {
        return tramway;
    }

    public boolean getIzban() {
        return izban;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLang(float lang) {
        this.lang = lang;
    }

    public void setStation_type(String station_type) {
        this.station_type = station_type;
    }

    public void setTramway(boolean tramway) {
        this.tramway = tramway;
    }

    public void setIzban(boolean izban) {
        this.izban = izban;
    }
}