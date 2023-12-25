package Java01.exercise01;

import java.util.Scanner;

public class task09Palindromes {
    public static void main(String[] args) {
        System.out.println("Please enter count of rows to check for palindromes");
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.printf("Enter number or text for #%d %n", i + 1);
            String number = scanner.nextLine();
            int length = number.length();
            String reversed = "";
            for (int j = length - 1; j >= 0; j--){
                reversed = reversed + number.charAt(j);
            }
            if (number.equals(reversed))
                System.out.println("Entered number or text is a palindrome.");
            else
                System.out.println("Entered number or text is not a palindrome.");
        }
    }
}
