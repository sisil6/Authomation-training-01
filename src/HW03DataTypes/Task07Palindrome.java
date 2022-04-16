/*Write a program which validate whether given string is palindrome
(A palindrome is a sequence of characters which reads the same backward as forward, such as madam or racecar)
 */
package HW03DataTypes;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverse;
import static java.util.Collections.reverseOrder;

public class Task07Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        List<Character> textCharacters = new ArrayList();

        //need to reverse the list and compare them
        // not finished task


        List<Character> textCharactersReversed = new ArrayList<>();
        //  textCharactersReversed = reverseOrder(textCharacters);


        for (char ch : text.toCharArray()) {
            textCharacters.add(ch);
        }


        //  for (char i = textCharacters.size(); i > 0; i--) {
        //      textCharactersReversed.add((char) i);
        //   }

        // for (int i = 0; i < textCharacters.size(); i++) {
        //if(textCharacters.get(i).equals(textCharacters.get(textCharacters.)))


        //   }
    }
}

