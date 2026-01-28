package Project;

public class Main {
    public static void main(String[] args) {

        TravelCompany yemenAir = new TravelCompany("Yemen Air");
        yemenAir.addTrip(new Trip("Sana'a", "Cairo", 400));
        yemenAir.addTrip(new Trip("Aden", "Jeddah", 280));

        TravelCompany turkish = new TravelCompany("Turkish");
        turkish.addTrip(new Trip("Istanbul", "Paris", 650));

        TransiTera system = new TransiTera();
        system.addCompany(yemenAir);
        system.addCompany(turkish);

        system.showCompany("Yemen Air");

        system.requestBooking("Passenger A → Cairo");
        system.requestBooking("Passenger B → Paris");

        system.processBooking();

    }
}