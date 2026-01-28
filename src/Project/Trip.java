package Project;

public class Trip {
    private String from;
    private String to;
    private double price;

    public Trip(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public String getDetails() {
        return from + " → " + to + " | $" + price;
    }
}
