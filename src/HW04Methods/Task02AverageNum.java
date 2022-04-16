/*Write a Java method to compute the average of three numbers.*/

package HW04Methods;


import java.util.Scanner;

public class Task02AverageNum {

    public static double averageNum(int x, int y, int z) {
        double average = (double) (x+y+z)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.printf("The average sum is %.2f.", averageNum(x, y, z));
    }
}
