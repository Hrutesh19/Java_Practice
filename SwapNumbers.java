//Write a Java program to swap two numbers by using the third variable

public class SwapNumbers {
    public static void main(String[] args) {
        // Define two numbers
        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Create a third variable to temporarily hold one of the numbers
        int temp;

        // Swap the numbers
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
