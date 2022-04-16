/*Print elements of a given 2-d matrix with dynamic rows and columns taken from user input*/
package HW03DataTypes;

import java.util.Scanner;

public class Task03dynamicMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of columns of the matrix:");
        int columns = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of rows of the matrix:");
        int rows = Integer.parseInt(scanner.nextLine());
        int nums = columns * rows;
        int[][] arr = new int[rows][columns];
        System.out.println("Enter " + nums + " numbers of the matrix:");
        int[] myArray = new int[nums];
        for (int i = 0; i < nums; i++) {
            myArray[i] = scanner.nextInt();
        }

        // how to print the matrix?
        //not finished task

    }
}
