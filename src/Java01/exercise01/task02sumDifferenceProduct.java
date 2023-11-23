package Java01.exercise01;

import java.util.Scanner;

public class task02sumDifferenceProduct {
    public static void main(String[] args){
        Scanner scannerA= new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number...");
        Integer numA = Integer.parseInt(scannerA.nextLine());
        Scanner scannerB= new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter another number...");
        Integer numB = Integer.parseInt(scannerA.nextLine());
        Integer sum = numA + numB;
        Integer difference = numA - numB;
        Integer product = numA * numB;
        System.out.printf("Sum of %d and %d is %d\n", numA, numB, sum );
        System.out.printf("Difference of %d and %d is %d\n", numA, numB, difference);
        System.out.printf("Product of %d and %d is %d\n", numA, numB, product);
    }
}
