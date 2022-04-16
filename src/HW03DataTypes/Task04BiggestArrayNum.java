/*Find biggest element of an array and print it in the console*/
package HW03DataTypes;

import java.util.Scanner;

public class Task04BiggestArrayNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            myArray[i] = scanner.nextInt();
        }
int biggestNum = 0;

        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]>biggestNum){
                biggestNum = myArray[i];
            }
        }
        System.out.println("The biggest number in the array is " + biggestNum);
    }
}
