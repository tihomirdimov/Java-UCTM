package Java01.exercise01;
import java.util.Scanner;

public class task01GallonsToLiters {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in gallons...");
        String input = scanner.nextLine();
        double gallons = Double.parseDouble(input);
        double liters = gallons*3.7854;
        if (gallons > 1) {
            System.out.printf("%.0f gallons equals %.3f liters\n", gallons, liters);
        }
        else if (gallons == 1) {
            System.out.printf("%.0f gallon equals %.3f liters\n", gallons, liters);
        }
        else if (gallons < 1){
            System.out.println("Please enter positive number\n");
        }
    }

}