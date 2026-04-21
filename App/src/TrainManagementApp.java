import java.util.*;

class Transaction {
    int id;
    double fee;
    String timestamp;

    Transaction(int id, double fee, String timestamp) {
        this.id = id;
        this.fee = fee;
        this.timestamp = timestamp;
    }
}

public class TrainManagementApp {

    // 🔵 Bubble Sort (≤100)
    static void bubbleSort(ArrayList<Transaction> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    Transaction temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    // 🟢 Insertion Sort (100–1000)
    static void insertionSort(ArrayList<Transaction> list) {
        for (int i = 1; i < list.size(); i++) {
            Transaction key = list.get(i);
            int j = i - 1;

            while (j >= 0 && (
                    list.get(j).fee > key.fee ||
                            (list.get(j).fee == key.fee &&
                                    list.get(j).timestamp.compareTo(key.timestamp) > 0)
            )) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }
    }

    // 🔴 High-fee outliers (>50)
    static void findOutliers(ArrayList<Transaction> list) {
        System.out.println("\nHigh-fee transactions (>50):");
        boolean found = false;

        for (Transaction t : list) {
            if (t.fee > 50) {
                System.out.println("ID: " + t.id + " Fee: " + t.fee);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }

    // ⚙️ Main processing logic
    static void processTransactions(ArrayList<Transaction> list) {
        int n = list.size();

        if (n <= 100) {
            System.out.println("\nUsing Bubble Sort (by fee):");
            bubbleSort(list);
        } else if (n <= 1000) {
            System.out.println("\nUsing Insertion Sort (by fee + timestamp):");
            insertionSort(list);
        }

        // Print sorted result
        System.out.println("\nSorted Transactions:");
        for (Transaction t : list) {
            System.out.println("ID: " + t.id + ", Fee: " + t.fee + ", Time: " + t.timestamp);
        }

        // Find outliers
        findOutliers(list);
    }

    // 🚀 Main method
    public static void main(String[] args) {

        ArrayList<Transaction> list = new ArrayList<>();

        // Sample Input
        list.add(new Transaction(1, 10.5, "10:00"));
        list.add(new Transaction(2, 25.0, "09:30"));
        list.add(new Transaction(3, 5.0, "10:15"));

        processTransactions(list);
    }
}