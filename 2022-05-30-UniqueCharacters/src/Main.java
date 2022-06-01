/** @author Elizabeth Norman, @spicedboi
 *
 * Cassidoo Interview Question May 30th, 2022!
 *
 * This week’s question:
 * Write a function that determines if all the characters in a given string are unique. Can you do this without making
 * any new variables? You choose if you want to include capitalization in your consideration for this one,
 * as a fun challenge.
 *
 * Example:
 *
 * > allUnique('Cassidy')
 * > false
 *
 * > allUnique('cat & dog')
 * > false
 *
 * > allUnique('cat+dog')
 * > true
 */

public class Main
{

    public static void main(String [] args)
    {
        //some test strings!
        System.out.println(allUnique("lizarDd"));
        System.out.println(allUnique("lizard"));
        System.out.println(allUnique("Cassidy"));
        System.out.println(allUnique("cat & dog"));
        System.out.println(allUnique("cat+dog"));
    }

    public static boolean allUnique(String s)
    {
        //maybe not efficient, at O(n^2), but it works! and that's what we like, right?
        for (int i = 0; i < s.length()-1; i++)
        {
            for (int j = i +1; j < s.length(); j ++)
            {
                //to avoid creating new variables, we compare the string to itself, and we call the toLower method
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j)))
                    return false;
            }
        }
        return true;
    }

}
