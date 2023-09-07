import java.util.ArrayList;
import java.util.Scanner;
public class ReverseArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Enter 5 values at runtime and add them to the ArrayList
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a value: ");
            int value = scanner.nextInt();
            arrayList.add(value);
        }

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Print the reversed ArrayList using .get() method
        System.out.print("Reversed ArrayList: ");
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }

        scanner.close();
    }
}

