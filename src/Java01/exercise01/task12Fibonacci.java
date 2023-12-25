package Java01.exercise01;

public class task12Fibonacci {
    public static void main (String[] args){
        int count = 20;
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        int sum = a+b;
        for (int i = 2; i < count; i++){
            c = a+b;
            sum += c;
            System.out.println(c);
            a = b;
            b = c;
        }
        double average = (double) sum /count;
        System.out.printf("Average of Fibonacci row is %.2f", average);
    }
}