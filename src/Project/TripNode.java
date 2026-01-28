package Project;

public class TripNode {
    Trip trip;
    TripNode next;

    TripNode(Trip trip) {
        this.trip = trip;
    }
}

class TripLinkedList {
    private TripNode head;

    public void add(Trip trip) {
        TripNode node = new TripNode(trip);
        if (head == null) {
            head = node;
        } else {
            TripNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printTrips() {
        TripNode temp = head;
        while (temp != null) {
            System.out.println("   - " + temp.trip.getDetails());
            temp = temp.next;
        }
    }
}
