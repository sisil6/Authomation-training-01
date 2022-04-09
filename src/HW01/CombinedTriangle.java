package HW01;

import java.util.Scanner;

public class CombinedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first side of triangle:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Type second side of triangle:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Type third side of triangle:");
        double c = Double.parseDouble(scanner.nextLine());

        double area = (a * b)/2;
        double perimeter = a + b + c;
        System.out.printf("The area of your triangle is %.2f and the perimeter is %.2f", area, perimeter);
    }
}
