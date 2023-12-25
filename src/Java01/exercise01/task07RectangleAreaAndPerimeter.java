package Java01.exercise01;

import java.util.Scanner;

public class task07RectangleAreaAndPerimeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter rectangle length");
        String l = scanner.nextLine();
        double length = Double.parseDouble(l);
        System.out.println("Please enter rectangle width");
        String w = scanner.nextLine();
        double width = Double.parseDouble(w);
        double area = length*width;
        double perimeter = width*2+length*2;
        System.out.printf("Rectangle area: %.2f %n", area);
        System.out.printf("Rectangle perimeter: %.2f ", perimeter);
    }}
