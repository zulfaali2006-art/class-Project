package Project;

public class TravelCompany {
    private String name;
    private TripLinkedList trips = new TripLinkedList();

    public TravelCompany(String name) {
        this.name = name;
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void showTrips() {
        System.out.println("Company: " + name);
        trips.printTrips();
    }

    public String getName() {
        return name;
    }
}
