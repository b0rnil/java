package ClassCodes.BasicOperatorsAndOperations;
import java.util.*;

public class BasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the next number: ");
        double b = sc.nextDouble();
        
        double sum = a + b;
        double diff = a - b;
        double prod = a * b;
        double frac = a / b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Fraction = " + frac);

        sc.close();
    }
}
