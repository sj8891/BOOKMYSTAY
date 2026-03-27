
import java.util.*;

public class UseCase6RoomAllocationService {

    static Map<String, Set<String>> roomMap = new HashMap<>();

    static {
        roomMap.put("Single", new HashSet<>(Arrays.asList("S1","S2")));
        roomMap.put("Double", new HashSet<>(Arrays.asList("D1","D2")));
    }

    public static void main(String[] args) {
        Queue<String> requests = new LinkedList<>();
        requests.add("Single");

        while (!requests.isEmpty()) {
            String type = requests.poll();
            Set<String> rooms = roomMap.get(type);

            if (!rooms.isEmpty()) {
                String allocated = rooms.iterator().next();
                rooms.remove(allocated);
                System.out.println("Allocated: " + allocated);
            }
        }
    }
}
