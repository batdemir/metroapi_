package models.parking;

public class Poi {
    private boolean metroStation;
    private boolean tramStation;
    private boolean trainStation;
    private boolean busStation;

    // Getter Methods

    public boolean getMetroStation() {
        return metroStation;
    }

    public boolean getTramStation() {
        return tramStation;
    }

    public boolean getTrainStation() {
        return trainStation;
    }

    public boolean getBusStation() {
        return busStation;
    }

    // Setter Methods

    public void setMetroStation(boolean metroStation) {
        this.metroStation = metroStation;
    }

    public void setTramStation(boolean tramStation) {
        this.tramStation = tramStation;
    }

    public void setTrainStation(boolean trainStation) {
        this.trainStation = trainStation;
    }

    public void setBusStation(boolean busStation) {
        this.busStation = busStation;
    }
}