/*A takes as input a non-negative integer and returns true if the number is a palindrome;
Non-negative integer is called a palindrome if it reads forward and backward in the same way.
For example, the numbers 5, 121, 3443, and 123454321 are palindromes. */
package HW04Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task05IntPalindrome {

    public static boolean isPalindrome(int x) {

        int length = String.valueOf(x).length();
        List<Character> textCharacters = new ArrayList();
        List<Character> textCharactersReversed = new ArrayList();

        //not finished task

        for (int i = 0; i < length; i++) {
          // textCharacters.add(i);
        }
        for (int i = length; i >= 0; i--) {
          //  textCharactersReversed.add((i));
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(textCharacters.get(i).equals(textCharactersReversed.get(j)))
                {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));
    }
}
