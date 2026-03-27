
import java.io.*;
import java.util.*;

class DataStore implements Serializable {
    List<String> bookings = new ArrayList<>();
}

public class UseCase12DataPersistenceSystemRecovery {
    public static void main(String[] args) {
        String file = "data.ser";

        try {
            DataStore store = new DataStore();
            store.bookings.add("Booking1");

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(store);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            DataStore loaded = (DataStore) in.readObject();
            in.close();

            System.out.println("Recovered: " + loaded.bookings);

        } catch (Exception e) {
            System.out.println("Recovery failed");
        }
    }
}
