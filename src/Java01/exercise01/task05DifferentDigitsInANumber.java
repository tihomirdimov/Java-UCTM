package Java01.exercise01;

import java.util.Scanner;

public class task05DifferentDigitsInANumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 3 digit number");
        String inputNum = scanner.nextLine();
        int num = Integer.parseInt(inputNum);
        char[] output = inputNum.toCharArray();
        if (num>99 && num<1000 ) {
            boolean result = false;
            for(int i = 0; i<output.length ; i++){
                if(output[i] == '7'){
                    result = true;
                    break;
                }
            }
            System.out.println(result);
        }
        else {
            System.out.printf("%d is not a 3 digit number" , num);
        }
    }
}
