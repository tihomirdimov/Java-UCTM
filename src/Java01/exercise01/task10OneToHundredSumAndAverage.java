package Java01.exercise01;

public class task10OneToHundredSumAndAverage {
    public static void main (String[] args) {
        int limit = 100;
        int sum = 0;
        int i = 1;
        while (i <= limit) {
            sum+=i;
            i++;
        }
        double average = (double) sum / limit;
        System.out.printf("Sum of all numbers between 1 and 100 is %d %n", sum);
        System.out.printf("Average of all numbers between 1 and 100 is %.2f", average);
    }
}
