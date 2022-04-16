/*Reverse the order of the elements in a LinkedList using algorithm*/

package HW03DataTypes;

import java.util.LinkedList;
import java.util.Scanner;

public class Task05ReversearrayOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the list:");
        int length = Integer.parseInt(scanner.nextLine());
        LinkedList<Integer> nums = new LinkedList<Integer>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < length; i++) {
            nums.add(scanner.nextInt());
        }

        for (int i = length-1; i >= 0; i--) {
            System.out.print(nums.get(i) + " ");

        }
    }
}
