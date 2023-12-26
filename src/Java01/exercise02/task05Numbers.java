package Java01.exercise02;

import java.util.Arrays;
import java.util.Scanner;

public class task05Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Numbers numbers = new Numbers(input);
        System.out.println("Sum: " + numbers.GetSum());
        System.out.println("Average: " + numbers.GetAvg());
        System.out.println("Is even: " + numbers.IsEven());
        System.out.println("Average even: " + numbers.GetEventAvg());
        numbers.PrintNumber();
        numbers.IsPalindrome();
    }

    public static class Numbers {
        int number;

        public Numbers(int n) {
            if (n > 0 && n < 1000) {
                number = n;
            } else {
                number = 0;
            }
        }

        public int GetSum() {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            return sum;
        }

        public int GetAvg() {
            int sum = this.GetSum();
            int count = 0;
            for (int i = 1; i <= number; i++) {
                count = i;
            }
            return sum / count;
        }

        public boolean IsEven() {
            return number % 2 == 0;
        }

        public int GetEventAvg() {
            int sum = 0;
            int count = 0;
            for (int i = 1; i <= number; i++) {
                Numbers number = new Numbers(i);
                if (number.IsEven()) {
                    sum += i;
                    count++;
                } else {
                    continue;
                }
            }
            return sum / count;
        }

        public void PrintNumber() {
            char[] chars = ("" + number).toCharArray();
            for (char num : chars) {
                switch (num) {
                    case '1':
                        System.out.print("Едно ");
                        break;
                    case '2':
                        System.out.print("Две ");
                        break;
                    case '3':
                        System.out.print("Три ");
                        break;
                    case '4':
                        System.out.print("Четири ");
                        break;
                    case '5':
                        System.out.print("Пет ");
                        break;
                    case '6':
                        System.out.print("Шест ");
                        break;
                    case '7':
                        System.out.print("Седем ");
                        break;
                    case '8':
                        System.out.print("Осем ");
                        break;
                    case '9':
                        System.out.print("Девет ");
                        break;
                    case '0':
                        System.out.print("Нула ");
                        break;
                }
                System.out.println();
            }
        }

        public void IsPalindrome() {
            char[] chars = ("" + number).toCharArray();
            char[] reversed = new char[chars.length];
            int reversedLength = chars.length-1;
            for (int i = 0; i < chars.length; i++) {
                reversed[reversedLength] = chars[i];
                reversedLength--;
            }
            if (Arrays.equals(chars, reversed)) {
                System.out.println("Entered number is a palindrome.");
            } else {
                System.out.println("Entered number is not a palindrome.");
            }
        }
    }
}

