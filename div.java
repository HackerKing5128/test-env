import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double a = sc.nextDouble();
        System.out.print("Enter denominator: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
        } else {
            double result = a / b;
            System.out.println("Result: " + result);
        }
    }
}
