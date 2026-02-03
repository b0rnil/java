package aClassCodes.VarAndDataTypes;
//Same code as [Variables](src/basic/Variables.java) but while taking input from user.

import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Temperature: ");
        float temperature = sc.nextFloat();

        System.out.println("Enter Grade:  ");
        String grade = sc.next();

        System.out.println("Is a student? (true or false): ");
        boolean isStudent = sc.nextBoolean();

        //Display
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("Is a student: " + isStudent);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
