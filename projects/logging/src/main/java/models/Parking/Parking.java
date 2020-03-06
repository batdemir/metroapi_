package models.parking;

public class Parking {
    private String parkId;
    private String name;
    private String type;
    private String status;
    Occupancy OccupancyObject;
    OpeningHours OpeningHoursObject;
    private boolean isPaid;
    private boolean nonstop;
    Accessibility AccessibilityObject;
    Payment PaymentObject;
    Poi PoiObject;
    private float lat;
    private float lng;

    // Getter Methods

    public String getParkId() {
        return parkId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public Occupancy getOccupancy() {
        return OccupancyObject;
    }

    public OpeningHours getOpeningHours() {
        return OpeningHoursObject;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public boolean getNonstop() {
        return nonstop;
    }

    public Accessibility getAccessibility() {
        return AccessibilityObject;
    }

    public Payment getPayment() {
        return PaymentObject;
    }

    public Poi getPoi() {
        return PoiObject;
    }

    public float getLat() {
        return lat;
    }

    public float getLng() {
        return lng;
    }

    // Setter Methods

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOccupancy(Occupancy occupancyObject) {
        this.OccupancyObject = occupancyObject;
    }

    public void setOpeningHours(OpeningHours openingHoursObject) {
        this.OpeningHoursObject = openingHoursObject;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public void setNonstop(boolean nonstop) {
        this.nonstop = nonstop;
    }

    public void setAccessibility(Accessibility accessibilityObject) {
        this.AccessibilityObject = accessibilityObject;
    }

    public void setPayment(Payment paymentObject) {
        this.PaymentObject = paymentObject;
    }

    public void setPoi(Poi poiObject) {
        this.PoiObject = poiObject;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }
}

public class Poi {

    // Getter Methods

    // Setter Methods

}

public class Payment {

    // Getter Methods

    // Setter Methods

}

public class Accessibility {

    // Getter Methods

    // Setter Methods

}

public class OpeningHours {

    // Getter Methods

    // Setter Methods

}

public class Occupancy {

    // Getter Methods

    // Setter Methods

}