/* Write program to print sum of a given array elements*/

package HW03DataTypes;

import java.util.Scanner;

public class Task01ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            myArray[i] = scanner.nextInt();
        }

        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            arraySum = arraySum + myArray[i];
        }
        System.out.println("The sum of the array items is " + arraySum);
    }
}
