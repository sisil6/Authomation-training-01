/*Print elements of a given 2-d matrix with 4 rows and 3 columns */

package HW03DataTypes;

import java.util.Scanner;

public class Task02matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArray = new int[12];
        System.out.println("Enter 12 elements of the matrix:");
        for (int i = 0; i < 12; i++) {
            myArray[i] = scanner.nextInt();
        }


        int[][] arr = new int[4][3];
        arr[0][0] = myArray[0];
        arr[0][1] = myArray[1];
        arr[0][2] = myArray[2];
        arr[1][0] = myArray[3];
        arr[1][1] = myArray[4];
        arr[1][2] = myArray[5];
        arr[2][0] = myArray[6];
        arr[2][1] = myArray[7];
        arr[2][2] = myArray[8];
        arr[3][0] = myArray[9];
        arr[3][1] = myArray[10];
        arr[3][2] = myArray[11];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0){
                System.out.print(arr[i][j] + " ");}
                else if(i==1){
                  System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


