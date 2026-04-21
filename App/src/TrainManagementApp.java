import java.util.*;

public class TrainManagementApp {

    // 🔵 Bubble Sort Method
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Apply Bubble Sort
        bubbleSort(capacities);

        System.out.println("\nAfter Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}