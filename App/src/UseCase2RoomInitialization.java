/**
 * Use Case 2: Basic Room Types & Static Availability
 * Demonstrates inheritance and abstraction.
 *
 * @author cyan2005
 * @version 2.0
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay - Hotel Booking System v2.0 =====");

        // Create room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 10;
        int doubleAvailable = 5;
        int suiteAvailable = 2;

        System.out.println("\nSingle Room Details");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " + singleAvailable);

        System.out.println("\nDouble Room Details");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleAvailable);

        System.out.println("\nSuite Room Details");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteAvailable);
    }
}