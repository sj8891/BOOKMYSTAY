
public class UseCase11ConcurrentBookingSimulation {

    static int rooms = 2;

    public synchronized static void book(String user) {
        if (rooms > 0) {
            rooms--;
            System.out.println(user + " booked room");
        } else {
            System.out.println(user + " failed");
        }
    }

    public static void main(String[] args) {
        Runnable task = () -> book(Thread.currentThread().getName());

        new Thread(task, "User1").start();
        new Thread(task, "User2").start();
        new Thread(task, "User3").start();
    }
}
