import java.util.*;

public class TrainManagementApp {

    // 🔍 Linear Search with validation
    static boolean searchBogie(String[] bogies, String key) {

        // 🚫 Fail-fast check
        if (bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        // Perform search
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Example 1: Empty array (will throw exception)
        String[] bogies = {};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogies, key);

            if (found) {
                System.out.println("Bogie found.");
            } else {
                System.out.println("Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}