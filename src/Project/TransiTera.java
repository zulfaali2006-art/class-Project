package Project;

public class TransiTera {
    private SimpleMap companies = new SimpleMap();
    private MyQueue<String> bookingQueue = new MyQueue<>();
    private MyStack<String> history = new MyStack<>();

    public void addCompany(TravelCompany company) {
        companies.put(company.getName(), company);
        history.push("Added company: " + company.getName());
    }

    public void requestBooking(String info) {
        bookingQueue.enqueue(info);
        history.push("Booking requested: " + info);
    }

    public void processBooking() {
        String booking = bookingQueue.dequeue();
        System.out.println("Processing booking: " + booking);
    }

    public void showCompany(String name) {
        TravelCompany c = companies.get(name);
        if (c != null) c.showTrips();
    }
}
