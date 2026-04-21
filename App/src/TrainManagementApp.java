import java.util.*;

public class TrainManagementApp {

    // 🔍 Linear Search Method
    static boolean linearSearch(String[] bogies, String key) {
        for (String b : bogies) {
            if (b.equals(key)) {
                return true; // found
            }
        }
        return false; // not found
    }

    public static void main(String[] args) {

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie found in the train.");
        } else {
            System.out.println("Bogie not found.");
        }

        sc.close();
    }
}