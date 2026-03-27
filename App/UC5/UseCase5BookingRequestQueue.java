
import java.util.*;

class Reservation {
    String name;
    String roomType;

    public Reservation(String name, String roomType) {
        this.name = name;
        this.roomType = roomType;
    }
}

public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        Queue<Reservation> queue = new LinkedList<>();

        queue.add(new Reservation("User1", "Single"));
        queue.add(new Reservation("User2", "Double"));

        while (!queue.isEmpty()) {
            Reservation r = queue.poll();
            System.out.println("Processing: " + r.name + " - " + r.roomType);
        }
    }
}
