package Java01.exercise01;

import java.util.Scanner;

public class task04TrueIfSevenIsPresent {
    public static void main(String[] args){
        System.out.println("Please enter a 3 digit number");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer num = Integer.parseInt(input);
        if (num>99 && num<1000 ) {
            System.out.print(input.contains("7"));
        }
        else {
            System.out.printf("%d is not a 3 digit number" , num);
        }
    }
}
