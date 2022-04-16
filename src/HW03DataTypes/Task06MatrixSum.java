/* Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns */

package HW03DataTypes;

import java.util.LinkedList;
import java.util.Scanner;

public class Task06MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> firstRow = new LinkedList<Integer>();
        LinkedList<Integer> secRow = new LinkedList<Integer>();
        LinkedList<Integer> thirdRow = new LinkedList<Integer>();
        LinkedList<Integer> forthRow = new LinkedList<Integer>();
        System.out.println("Enter 16 numbers of the list:");
        for (int i = 1; i <= 16; i++) {
            if (i <= 4) {
                firstRow.add(scanner.nextInt());
            }
            else if (5 <= i && i <= 8) {
                secRow.add(scanner.nextInt());
            }
            else if (9 <= i && i <= 12) {
                thirdRow.add(scanner.nextInt());
            }
            else if (13<=i && i<=16){
                forthRow.add(scanner.nextInt());
            }
        }
            for (int j = 0; j < 4; j++) {
                System.out.print(firstRow.get(j) + " ");
            }
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(secRow.get(j) + " ");
            }
        System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(thirdRow.get(j) + " ");
            }
        System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(forthRow.get(j) + " ");
            }
        System.out.println();
            int diagonalSum = firstRow.get(0) + secRow.get(1) + thirdRow.get(2) + forthRow.get(3);
            System.out.println("The sum of the diagonal is " + diagonalSum );

        }
    }

