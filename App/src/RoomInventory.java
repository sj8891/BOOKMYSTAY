import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory manages the centralized availability of rooms.
 * It uses a HashMap to store room types and available counts.
 *
 * @author cyan2005
 * @version 3.0
 */

public class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor initializes inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single Room", 10);
        inventory.put("Double Room", 5);
        inventory.put("Suite Room", 2);
    }

    // Get availability of a room type
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update room availability
    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Display entire inventory
    public void displayInventory() {
        System.out.println("Current Room Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }
}