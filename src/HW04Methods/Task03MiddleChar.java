/*Write a Java method to display the middle character of a string.
Note:
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Write a Java method to count all words in a string.
*/
package HW04Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03MiddleChar {

    public static List<Character> middleChar(String text) {
        char middleChar = ' ';
        char evenChar = ' ';
        List<Character> textCharacters = new ArrayList<>();
        for (char ch : text.toCharArray()) {
            textCharacters.add(ch);
        }
        List<Character> middleCharacters = new ArrayList<>();
        if (textCharacters.size() %2 == 0)
        {
            middleChar = textCharacters.get((textCharacters.size() / 2)-1);
            evenChar = textCharacters.get((textCharacters.size() / 2));
            middleCharacters.add(middleChar);
            middleCharacters.add(evenChar);
                   }
        else{
            middleChar = textCharacters.get((char)Math.ceil(textCharacters.size() / 2));
            middleCharacters.add(middleChar);
                   }

        return middleCharacters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        if(text.length()% 2 == 0)
        {
            System.out.println("The middle characters are " + middleChar(text).get(0) + " and " + middleChar(text).get(1));
        }
        else{
            System.out.println("The middle character is " + middleChar(text).get(0));
        }

    }
}
