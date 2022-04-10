/*Given a list iterate it and display numbers
which are divisible by 5 and if you find number greater than 150
stop the loop iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200] */
package HW02;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
            if (array[i] > 150) {
                break;
            }
        }
    }
}

