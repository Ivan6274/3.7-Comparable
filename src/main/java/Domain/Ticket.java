package Domain;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int coast;
    private String from;
    private String to;
    private int timeFly;

    public Ticket(int id, int coast, String from, String to, int timeFly) {
        this.id = id;
        this.coast = coast;
        this.from = from;
        this.to = to;
        this.timeFly = timeFly;
    }


    public int compareTo(Ticket o) {
        return this.coast - o.coast;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTimeFly() {
        return timeFly;
    }

    public void setTimeFly(int timeFly) {
        this.timeFly = timeFly;
    }


}