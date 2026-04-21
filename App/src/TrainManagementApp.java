import java.util.*;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}