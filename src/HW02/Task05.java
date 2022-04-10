/*Write a program which advices the user where to go to a vacation based on the type of the vacation and the budget.
There should be two options – Beach, Mountain.
If the user put a different value then the program should print a message that there is no information about this type of vacation.
Budgets are considered per day per person. If the budget per day for Beach type vacation
is smaller than 50 then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.
If the budget per day for Mountain type vacation is smaller than 30 then the program should advise Bulgaria as a destination,
otherwise Outside Bulgaria.
*/
package HW02;


import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type where do you want to go - Mountain or Beach:");
        String type = scanner.nextLine();
        System.out.println("Type your budget per person per day:");
        double budget = Double.parseDouble(scanner.nextLine());

        switch (type){
            case "Mountain":
                if(budget >= 30){
                    System.out.println("Your destination should be outside Bulgaria");
                }
                else{
                    System.out.println("Your destination should be Bulgaria");
                }
                break;

            case "Beach":
                if(budget >= 50){
                    System.out.println("Your destination should be outside Bulgaria");
                }
                else{
                    System.out.println("Your destination should be Bulgaria");
                } break;
            default:
                System.out.println("There is no information about this type of vacation");
                break;
        }

    }
}
