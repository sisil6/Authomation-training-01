/*Write a method named isEven that accepts an int argument.
The method should return true if the argument is even, or false otherwise.
 */

package HW04Methods;

import java.util.Scanner;

public class Task04EvenTrue {
    public static boolean isEven(int x) {
        int smallest = 0;
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        System.out.println(isEven(x));
    }
}

