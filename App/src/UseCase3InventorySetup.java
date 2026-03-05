/**
 * Use Case 3: Centralized Room Inventory Management
 * Demonstrates use of HashMap for inventory management.
 *
 * @author cyan2005
 * @version 3.0
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay - Hotel Booking System v3.0 =====");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        // Example update
        System.out.println("\nUpdating Single Room availability...");

        inventory.updateAvailability("Single Room", 8);

        // Display updated inventory
        inventory.displayInventory();
    }
}