package Java01.exercise01;

import java.util.Scanner;
import java.math.*;

public class task06CircleAreaAndCircumference {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        String input = scanner.nextLine();
        double radius = Double.parseDouble(input);
        double area = Math.PI*(Math.pow(radius,2));
        double circumference = radius*2*Math.PI;
        System.out.printf("Circle area: %.2f %n", area);
        System.out.printf("Circle circumference: %.2f ", circumference);
    }}
