/** @author Elizabeth Norman
 *
 * Cassidoo Interview Question June 26th 2022
 *
 * This week’s question:
 * Given a string str and a set of words dict, find the longest word in dict that is a subsequence of str.
 *
 * Example:
 *
 * let str = "abppplee"
 * let dict = {"able", "ale", "apple", "bale", "kangaroo"}
 *
 * $ longestWord(str, dict)
 * $ 'apple'
 * // "able" and "ale" also work, but are shorter than "apple"
 * // "bale" has all the right letters, but not in the right order
 *
 */


public class Main
{
    public static void main (String [] args)
    {
        String s = "abppleee";
        String[] d = {"able", "ale", "apple", "bale", "kangaroo"};
        System.out.println(longestWord(s, d)); //prints apple
    }

    public static String longestWord(String s, String[] d)
    {
        String longest = "";
        for (int i = 0; i < d.length; i ++)
        {
           if(isSubsequence(d[i], s))
               if(d[i].length() > longest.length())
                   longest = d[i];
        }
        return longest;
    }

    public static boolean isSubsequence(String s1, String s2)
    {

        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length())
        {
            if (s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }

        return i == s1.length();
    }

}
