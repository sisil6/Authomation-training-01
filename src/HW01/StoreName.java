/*Store your names in 3 different variables and print your whole name
*/
package HW01;

import java.util.Scanner;

public class StoreName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Type your middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Type your last name:");
        String lastName = scanner.nextLine();

        System.out.printf("Your name is %s %s %s", firstName, middleName, lastName);

    }
}
