package aClassCodes;
//Same code as [Variables](src/basic/Variables.java) but while taking input from user.

import java.util.*;
public class VariablesAndDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Temperature: ");
        float temperature = sc.nextFloat();

        System.out.println("Enter Grade:  ");
        char grade = sc.next().charAt(0);

        System.out.println("Is a student? (1 for true or false): ");
        boolean isStudent = sc.nextBoolean();

        //Display
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("Is a student: " + isStudent);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
