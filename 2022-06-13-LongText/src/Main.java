import java.util.ArrayList;
import java.util.Random;

/** @Author Elizabeth Norman, @spicedboi
 *
 * Cassidoo Interview Question June 13th, 2022
 * 
 * This week’s question:
 * Create a loooong teeeext generator that takes in a string and an integer n, and multiplies
 * the vowels in the string by n.
 *
 * Example:
 *
 * $ longText('hello world', 3)
 * $ 'heeellooo wooorld'
 *
 * $ longText('lol', 10)
 * $ 'looooooooool'
 */

public class Main
{
    public static void main (String [] args)
    {
        longText("hello world", 3);
        longText("lol", 10);
        longText("yeet beep", 4);
        longText("wow", -2);
    }

    public static void longText(String s, int n)
    {

        if (n < 0)
        {
            return;
        }

        Random randy = new Random();
        String vowels;


        // I decided to make it random if y was included or not for fun lol :)
        int x = randy.nextInt(2);
        if (x == 1)
        {
            vowels = "aeiouy";
        }
        else
        {
            vowels = "aeiou";
        }

        //working around strings immutability with an array list of characters
        ArrayList<Character> stringAL = new ArrayList<Character>();

        char[] ca = s.toCharArray();
        for(char c : ca)
            stringAL.add(c); //fill up the arraylist


        for (int i = 0; i < stringAL.size(); i ++)
        {
            if (vowels.contains(stringAL.get(i).toString())) //I'd like to buy a vowel
            {
                for (int j = 1; j < n; j++)
                {
                    stringAL.add(i, stringAL.get(i));
                    i++;
                }

            }
        }

        s = stringAL.toString();
        System.out.println(s);

    }


}
