package ClassCodes.VarAndDataTypes;
import java.util.*;

public class InchesToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter inches: ");
        double inches = sc.nextDouble();

        double meter = inches*0.0254;

        System.out.println("Meters: " + meter);

        sc.close();
    }
}
