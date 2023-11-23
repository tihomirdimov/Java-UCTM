package Java01.exercise01;

import java.util.Scanner;

public class task03FToC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in F...");
        int tempF = Integer.parseInt(scanner.nextLine());
        int tempC = ((tempF - 32) * 5) / 9;
        System.out.printf("Temperature in Celsius is %d C", tempC);
    }
}
