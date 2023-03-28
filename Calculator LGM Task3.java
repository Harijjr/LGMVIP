import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        double num1 = 0, num2 = 0;

        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Square root");
            System.out.println("7. Logarithm");
            System.out.println("0. Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Enter two numbers:");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Enter two numbers:");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Enter a number and its power:");
                    num1 = input.nextDouble();
                    num2 = input.nextDouble();
                    System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                    break;
                case 6:
                    System.out.println("Enter a number:");
                    num1 = input.nextDouble();
                    System.out.println("sqrt(" + num1 + ") = " + Math.sqrt(num1));
                    break;
                case 7:
                    System.out.println("Enter a number:");
                    num1 = input.nextDouble();
                    System.out.println("log(" + num1 + ") = " + Math.log(num1));
                    break;
                case 0:
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);

        input.close();
    }
}
