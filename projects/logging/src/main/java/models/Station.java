public class Station {
    private float id;
    private String station;
    private float line;
    private float escalator;
    private float elevator;
    private boolean is_peron_ada;
    private float ticket_office;
    private float toll_gate_ent;
    private float toll_gate_ex;
    private float entrance_exit;

    // Getter Methods

    public float getId() {
        return id;
    }

    public String getStation() {
        return station;
    }

    public float getLine() {
        return line;
    }

    public float getEscalator() {
        return escalator;
    }

    public float getElevator() {
        return elevator;
    }

    public boolean getIs_peron_ada() {
        return is_peron_ada;
    }

    public float getTicket_office() {
        return ticket_office;
    }

    public float getToll_gate_ent() {
        return toll_gate_ent;
    }

    public float getToll_gate_ex() {
        return toll_gate_ex;
    }

    public float getEntrance_exit() {
        return entrance_exit;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setLine(float line) {
        this.line = line;
    }

    public void setEscalator(float escalator) {
        this.escalator = escalator;
    }

    public void setElevator(float elevator) {
        this.elevator = elevator;
    }

    public void setIs_peron_ada(boolean is_peron_ada) {
        this.is_peron_ada = is_peron_ada;
    }

    public void setTicket_office(float ticket_office) {
        this.ticket_office = ticket_office;
    }

    public void setToll_gate_ent(float toll_gate_ent) {
        this.toll_gate_ent = toll_gate_ent;
    }

    public void setToll_gate_ex(float toll_gate_ex) {
        this.toll_gate_ex = toll_gate_ex;
    }

    public void setEntrance_exit(float entrance_exit) {
        this.entrance_exit = entrance_exit;
    }
}