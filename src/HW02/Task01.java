/*Write a program to print the days of the week based on the user digit 1-7 input.
The message should be
“The [user input digit]-st/nd/rd/th day of the week is [the day of the week]” Hint: Use switch-case.
 */

package HW02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String day = "";
        String end = "";

        switch (number) {
            case 1 -> {
                day = "Monday";
                end = "st";
            }
            case 2 -> {
                day = "Tuesday";
                end = "nd";
            }
            case 3 -> {
                day = "Wednesday";
                end = "rd";
            }
            case 4 -> {
                day = "Thursday";
                end = "th";
            }
            case 5 -> {
                day = "Friday";
                end = "th";
            }
            case 6 -> {
                day = "Saturday";
                end = "th";
            }
            case 7 -> {
                day = "Sunday";
                end = "th";
            }
        }
        System.out.printf("The %d-%s day of the week is %s", number,end, day);
    }
}
