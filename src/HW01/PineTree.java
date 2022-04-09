/*Print pine tree using asterisks in the console.*/

package HW01;

import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Type an integer number to create a pine:");
    int a = Integer.parseInt(scanner.nextLine());
    int num = 1;

    for (int i=0; i<a;i++){

        for (int j=0; j<a-i; j++){
            System.out.print(" ");
        }
        for (int k=0; k<i; k++){
            System.out.print("* ");
        }
        System.out.println("*");
    }

}
    }
