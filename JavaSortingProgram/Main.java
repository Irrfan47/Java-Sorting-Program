import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Get the elements from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display the sorting options
        System.out.println("Choose the sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Quick Sort");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Perform the selected sorting algorithm
        switch (choice) {
            case 1:
                SortingAlgorithms.bubbleSort(arr);
                break;
            case 2:
                SortingAlgorithms.selectionSort(arr);
                break;
            case 3:
                SortingAlgorithms.insertionSort(arr);
                break;
            case 4:
                SortingAlgorithms.quickSort(arr, 0, arr.length - 1);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}