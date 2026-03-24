abstract class Room {
    private int beds;
    private String size;
    private double price;

    public Room(int beds, String size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }
}

// Single Room
class SingleRoom extends Room {
    public SingleRoom() {
        super(1, "Small", 1000);
    }
}

// Double Room
class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, "Medium", 2000);
    }
}

// Suite Room
class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, "Large", 5000);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Creating room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display details
        System.out.println("Single Room:");
        single.displayDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room:");
        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room:");
        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}