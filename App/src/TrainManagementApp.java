import java.util.*;

public class TrainManagementApp {

    // 🔍 Binary Search Method
    static boolean binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(arr[mid]);

            if (result == 0) {
                return true; // found
            } else if (result > 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }
        return false; // not found
    }

    public static void main(String[] args) {

        // Bogie IDs (can be unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // 🔵 Step 1: Sort before Binary Search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Perform Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Display result
        if (found) {
            System.out.println("Bogie found (Binary Search).");
        } else {
            System.out.println("Bogie not found.");
        }

        sc.close();
    }
}