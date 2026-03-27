
import java.util.*;

class Inventory {
    private Map<String, Integer> rooms = new HashMap<>();

    public Inventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 0);
    }

    public Map<String, Integer> getAvailableRooms() {
        return Collections.unmodifiableMap(rooms);
    }
}

public class UseCase4RoomSearch {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        for (Map.Entry<String, Integer> entry : inventory.getAvailableRooms().entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
