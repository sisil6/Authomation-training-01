/*Find the largest number from a given array and print it in a console. Hint: use for loop*/

package HW02;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = Integer.parseInt(scanner.nextLine());
        int [] array = new int[length];
        System.out.println("Enter the elements of the array:");
            for(int i=0; i<length; i++ ) {
                array[i] = scanner.nextInt();
            }
        Arrays.sort(array);

            System.out.println(array[length-1]);
        }
    }

