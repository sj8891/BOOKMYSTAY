
import java.util.*;

public class UseCase10BookingCancellation {
    public static void main(String[] args) {
        Stack<String> allocated = new Stack<>();
        allocated.push("S1");
        allocated.push("S2");

        while (!allocated.isEmpty()) {
            String room = allocated.pop();
            System.out.println("Released: " + room);
        }
    }
}
