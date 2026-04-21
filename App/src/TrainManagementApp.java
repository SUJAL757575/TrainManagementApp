import java.util.*;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Array of bogie names
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        // 🔵 Built-in sorting
        Arrays.sort(bogies);

        // After sorting
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}