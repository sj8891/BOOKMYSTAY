
class InvalidRoomException extends Exception {
    public InvalidRoomException(String msg) { super(msg); }
}

public class UseCase9ErrorHandlingValidation {

    static void validate(String type) throws InvalidRoomException {
        if (!type.equals("Single") && !type.equals("Double")) {
            throw new InvalidRoomException("Invalid Room Type");
        }
    }

    public static void main(String[] args) {
        try {
            validate("Suite");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
