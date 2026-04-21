import java.util.*;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Create HashSet for bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}