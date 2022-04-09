/*Write a simple program, without checks to print the result of quadratic equation.*/
package HW01;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Type b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Type c:");
        double c = Double.parseDouble(scanner.nextLine());
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}
