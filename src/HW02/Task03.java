/*Write a Java program to calculate the revenue from a sale based on the unit price
and quantity of a product input by the user.
The discount rate is 15% for the quantity purchased between 100 and 120 units,
and 20% for the quantity purchased greater than 120 units.
If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:
	Enter unit price: 25
	Enter quantity: 110
	The revenue from sale: 2337.5$
	Discount: 412.5$(15.0%)
*/

package HW02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double discount = 0;

        if(100 <= count && count >= 120){
            discount = 0.15;
        }
        else if(120 < count){
            discount = 0.20;
        }

        double sumNoDiscount = count* price;
        double sumDiscounted = sumNoDiscount - (sumNoDiscount * discount);

        System.out.printf("%.2f$", sumDiscounted);


    }

}
