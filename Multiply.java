import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("what numbers to multiply? ");
        int count = sc.nextInt();

        double result = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter no. " + i + ": ");
            double num = sc.nextDouble();
            result *= num;
        }

        System.out.println("The final product = " + result);

        sc.close();
    }
}
