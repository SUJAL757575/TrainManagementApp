import java.util.*;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");
        System.out.println("After adding Pantry at position 2: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final train consist
        System.out.println("Final Train Consist: " + train);
    }
}