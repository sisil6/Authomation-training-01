package HW04Methods;

import java.util.Scanner;

/*Write a Java method to find the smallest number among three numbers*/
public class Task01SmallestNum {

    public static int minNum(int x, int y, int z) {
        int smallest = 0;
if(x<y)
{
    smallest = x;
}
else if( z < x){
    smallest = z;
}
else{
    smallest = y;
}
return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println("The smallest number is " + minNum(x, y, z));
    }
}