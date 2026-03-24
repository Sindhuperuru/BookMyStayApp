import java.util.HashMap;

// Room Inventory Class
class RoomInventory {
    private HashMap<String, Integer> inventory;

    // Constructor to initialize inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        // Initial room availability
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    // Get availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("Room Inventory:");
        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " Rooms Available: " + inventory.get(roomType));
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        // Example: Update availability
        System.out.println("\nUpdating Single Rooms...");

        inventory.updateAvailability("Single", 4);

        // Display updated inventory
        inventory.displayInventory();
    }
}