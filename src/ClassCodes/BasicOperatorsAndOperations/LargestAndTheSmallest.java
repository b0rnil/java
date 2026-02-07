package ClassCodes.BasicOperatorsAndOperations;
import java.util.*;
//Write a Java program to find the largest and smallest of three numbers using conditional operators
public class LargestAndTheSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input
        System.out.println("Enter three random numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = a;
        if(max<b){
            if(b<c){
                max = c;
            } else {
                max = b;
            }
        }
        else if(max<c){
            max = c;
        }

        int min = a;
        if (min>b) {
            if (b>c) {
                min = c;
            } else {
                min = b;
            }
        } else if(min>c) {
            min = c;
        }

        System.out.println("Max: "+ max + " " + "Min: " + min);
        sc.close();
    }
}
