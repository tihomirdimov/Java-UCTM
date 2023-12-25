package Java01.exercise01;

import java.util.Scanner;

public class task11DiffusionCoefficient {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter gas A molar mass");
        double mA = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter gas B molar mass");
        double mB = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter gas A volume");
        double vA = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter gas B volume");
        double vB = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter initial temperature");
        double tN = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter final temperature");
        double tK = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter temperature increment");
        double dT = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter initial pressure");
        double pN = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter final pressure");
        double pK = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter pressure increment");
        double dP = Double.parseDouble(scanner.nextLine());
        double molarMassComponent = Math.sqrt(((1/mA)+(1/mB)));
        double volumePower1 = 1.0/3.0;
        double volumePower2 = 1.0/2.0;
        double volumeComponent = Math.pow(((Math.pow(vA,volumePower1))+(Math.pow(vB,volumePower1))),volumePower2);
        double tConst = 0.00155;
        double tPower = 3.0/2.0;
        for (double i = tN; i <= tK; i+=dT){
            for (double j = pN; j <= pK; j+=dP){
                double tComponent = tConst*Math.pow(i,tPower);
                double dG = tComponent / (j*volumeComponent) * molarMassComponent;
                System.out.printf("Diffusion coefficient for temperature %.2f and pressure %.2f is %.2f %n", i,j, dG);
            }
        }
    }
}
