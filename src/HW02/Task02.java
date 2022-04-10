/*Write Java program to allow the user to input his/her age.
Then the program will show if the person is eligible to work.
A person who is eligible to work must be older than or equal to 16 years old.
Example:
	Enter your age: 16
	You are eligible to work.
*/
package HW02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        if(age >=16){
            System.out.println("You are eligible to work.");
        }
        else{
            System.out.println("You are Not eligible to work.");
        }


    }
}
