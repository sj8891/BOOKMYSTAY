
import java.util.*;

class Service {
    String name;
    double price;

    Service(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {
        Map<String, List<Service>> addOns = new HashMap<>();

        List<Service> services = Arrays.asList(
                new Service("Breakfast", 200),
                new Service("Spa", 500)
        );

        addOns.put("Booking1", services);

        double total = services.stream().mapToDouble(s -> s.price).sum();
        System.out.println("Total Add-on Cost: " + total);
    }
}
