/* Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]*/

package HW02;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

