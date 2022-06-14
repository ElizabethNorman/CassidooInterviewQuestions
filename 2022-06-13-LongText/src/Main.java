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

        String answer = "";
        String temp;

        for (int i = 0; i < s.length(); i ++)
        {
            temp = Character.toString(s.charAt(i));

            if (vowels.contains(temp)) //I'd like to buy a vowel
            {
                temp = temp.repeat(n);
            }
            answer += temp;
        }

        System.out.println(answer);

    }


}
