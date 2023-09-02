import java.util.Scanner;

public class DollarToRupeesConverter {

    public static void main(String[] args) {
        // Fixed exchange rate as of the knowledge cutoff date (1 USD to INR)
        double exchangeRate = 73.50;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in US Dollars: ");
        double dollars = scanner.nextDouble();

        // Convert dollars to Indian Rupees
        double rupees = dollars * exchangeRate;

        System.out.println(dollars + " US Dollars is equivalent to " + rupees + " Indian Rupees.");
    }
}
