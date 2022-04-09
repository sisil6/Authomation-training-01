/*Print the area of a triangle by given sides. Use formula to calculate it.*/

package HW01;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type one side of triangle:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Type other side of triangle:");
        double b = Double.parseDouble(scanner.nextLine());
        double area = (a * b)/2;
        System.out.printf("The area of your triangle is %.2f", area);
    }
}
