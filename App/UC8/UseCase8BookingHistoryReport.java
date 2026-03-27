
import java.util.*;

class Reservation {
    String name;
    public Reservation(String name) { this.name = name; }
}

public class UseCase8BookingHistoryReport {
    public static void main(String[] args) {
        List<Reservation> history = new ArrayList<>();

        history.add(new Reservation("User1"));
        history.add(new Reservation("User2"));

        for (Reservation r : history) {
            System.out.println("History: " + r.name);
        }
    }
}
