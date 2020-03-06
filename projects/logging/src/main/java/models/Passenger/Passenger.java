package models.passenger;

import java.util.ArrayList;

public class Passenger {
    private String name;
    ArrayList<Object> passenger_information = new ArrayList<Object>();

    // Getter Methods

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }
}