package Java01.exercise01;

import java.util.Scanner;

public class task08DetermineLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        String input = scanner.nextLine();
        int year = Integer.parseInt(input);
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("Year " + year + " is a leap year");
        }
        else{
            System.out.println("Year " + year + " is not a leap year");
        }
    }
}
