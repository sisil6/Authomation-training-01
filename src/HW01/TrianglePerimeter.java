/*Print the perimeter of a triangle by given sides. Use formula to calculate it. */

package HW01;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first side of triangle:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Type second side of triangle:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Type third side of triangle:");
        double c = Double.parseDouble(scanner.nextLine());
        double perimeter = a + b + c;
        System.out.printf("The perimeter of your triangle is %.2f", perimeter);
    }
}
