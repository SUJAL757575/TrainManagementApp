import java.util.*;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper"); // duplicate (will be ignored)

        // Display final train formation
        System.out.println("Train Formation (Insertion Order + Unique):");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}