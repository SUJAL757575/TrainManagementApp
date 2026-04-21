import java.util.*;

// Base class for Bogie
class Bogie {
    String type;

    public Bogie(String type) {
        this.type = type;
    }
}

// Passenger Bogie
class PassengerBogie extends Bogie {
    String category;
    int seatCapacity;

    public PassengerBogie(String category, int seatCapacity) {
        super("Passenger");
        this.category = category;
        this.seatCapacity = seatCapacity;
    }
}

// Goods Bogie
class GoodsBogie extends Bogie {
    String shape;
    String cargoType;

    public GoodsBogie(String shape, String cargoType) {
        super("Goods");
        this.shape = shape;
        this.cargoType = cargoType;
    }
}

// Main Application Class
public class TrainManagementApp {

    public static void main(String[] args) {

        // 1. Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize Train Consist (Empty List)
        List<Bogie> trainConsist = new ArrayList<>();

        // 3. Display Initial Bogie Count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // (Optional demo - adding some bogies)
        trainConsist.add(new PassengerBogie("Sleeper", 72));
        trainConsist.add(new PassengerBogie("AC Chair", 50));
        trainConsist.add(new GoodsBogie("Cylindrical", "Oil"));

        // 4. Display Updated Count
        System.out.println("Updated Bogie Count: " + trainConsist.size());

        // 5. Display Summary
        System.out.println("\nTrain Consist Summary:");
        for (Bogie b : trainConsist) {
            if (b instanceof PassengerBogie) {
                PassengerBogie p = (PassengerBogie) b;
                System.out.println("Passenger - " + p.category + " | Seats: " + p.seatCapacity);
            } else if (b instanceof GoodsBogie) {
                GoodsBogie g = (GoodsBogie) b;
                System.out.println("Goods - " + g.shape + " | Cargo: " + g.cargoType);
            }
        }
    }
}