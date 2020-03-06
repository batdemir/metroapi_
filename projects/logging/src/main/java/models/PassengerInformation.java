import java.util.ArrayList;

public class PassengerInformation {
    private String time_start;
    private String time_finish;
    private float total_passenger;
    ArrayList<PassengerByStation> passengerByStation = new ArrayList<PassengerByStation>();

    // Getter Methods

    public String getTime_start() {
        return time_start;
    }

    public String getTime_finish() {
        return time_finish;
    }

    public float getTotal_passenger() {
        return total_passenger;
    }

    // Setter Methods

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public void setTime_finish(String time_finish) {
        this.time_finish = time_finish;
    }

    public void setTotal_passenger(float total_passenger) {
        this.total_passenger = total_passenger;
    }
}