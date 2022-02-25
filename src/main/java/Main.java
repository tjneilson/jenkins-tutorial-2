import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");

        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        try {
            while (true) {
                String line = in.nextLine();
                switch (line) {
                    case "add":
                        int a = in.nextInt();
                        int b = in.nextInt();
                        System.out.println("Answer: " + calculator.add(a, b));
                        break;
                    case "subtract":
                        a = in.nextInt();
                        b = in.nextInt();
                        System.out.println("Answer: " + calculator.subtract(a, b));
                        break;
                    case "multiply":
                        a = in.nextInt();
                        b = in.nextInt();
                        System.out.println("Answer: " + calculator.multiply(a, b));
                        break;
                    case "divide":
                        a = in.nextInt();
                        b = in.nextInt();
                        System.out.println("Answer: " + calculator.divide(a, b));
                        break;
                    case "fibonacci":
                        a = in.nextInt();
                        System.out.println("Answer: " + calculator.fibonacciNumberFinder(a));
                        break;
                    case "binary":
                        a = in.nextInt();
                        System.out.println("Answer: " + calculator.intToBinaryNumber(a));
                        break;
                    default:
                        break;
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            // System.in has been closed
            in.close();
            System.out.println("System.in was closed; exiting");
        }
    }

}
