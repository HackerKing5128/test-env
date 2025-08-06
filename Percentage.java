import java.util.*;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total marks: ");
        int totalMarks = sc.nextInt();
        System.out.print("Enter the marks obtained: ");
        int obtainedMarks = sc.nextInt();   
        double percentage = ((double) obtainedMarks / totalMarks) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }   
}