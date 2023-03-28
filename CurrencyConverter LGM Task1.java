import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double usd_rate = 1.0; // 1 USD = 1 USD
        double eur_rate = 0.85; // 1 USD = 0.85 EUR
        double gbp_rate = 0.73; // 1 USD = 0.73 GBP
        double inr_rate = 73.64; // 1 USD = 73.64 INR
        
        System.out.print("Enter amount in USD: ");
        double usd_amount = scanner.nextDouble();
        
        System.out.println("Convert to: ");
        System.out.println("1. EUR");
        System.out.println("2. GBP");
        System.out.println("3. INR");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        
        double converted_amount = 0.0;
        String currency = "";
        
        switch (choice) {
            case 1:
                converted_amount = usd_amount * eur_rate;
                currency = "EUR";
                break;
            case 2:
                converted_amount = usd_amount * gbp_rate;
                currency = "GBP";
                break;
            case 3:
                converted_amount = usd_amount * inr_rate;
                currency = "INR";
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        
        System.out.printf("%.2f USD is equivalent to %.2f %s", usd_amount, converted_amount, currency);
        
        scanner.close();

    }

}
