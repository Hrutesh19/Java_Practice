import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the array
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Create an array of the specified length
        int[] arr = new int[length];

        // Input array elements from the user
        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the value to search for
        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == searchValue) {
                found = true;
                break; // Found the value, no need to continue searching
            }
        }

        // Check if the value was found or not
        if (found) {
            System.out.println("The value was found in the array.");
        } else {
            System.out.println("The value was not found in the array.");
        }

        scanner.close();
    }
}
