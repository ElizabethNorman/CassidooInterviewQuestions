import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Cassidoo Interview Question December 19th 2022
 * @author Elizabeth Norman
 *
 * A nice simple question but it took a lil second to work around the immutability of Strings in Java, but we got there :)
 * Happy with this one!
 *
 * This week’s question:
 * Given a string, make every consonant after a vowel uppercase. Can you do this with and without regex?
 *
 * Example:
 *
 * > capitalAfterVowel("hello world")
 * > "heLlo WoRld"
 *
 * > capitalAfterVowel("xaabeuekadii")
 * > "xaaBeueKaDii"
 */

public class Main
{
    public static void main(String [] args)
    {
        capitalAfterVowel("hello world");
        capitalAfterVowel("xaabeuekadii");
    }

    public static void capitalAfterVowel(String s)
    {
        //wanted a list, hate how to fill them in java so this is my work around lol
        Character [] cons = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
        List<Character> clist = new ArrayList<Character>(Arrays.asList(cons));
        Character [] vowl = {'a','e','i','o','u','y'};
        List<Character> alist = new ArrayList<Character>(Arrays.asList(vowl));


        //Just one loop, so O(N) :) 
        for (int i = 0; i < s.length()-1; i ++)
        {
            if(alist.contains(s.charAt(i)))
            {
                if(clist.contains(s.charAt(i+1)))
                {
                    s = s.substring(0,i+1) + Character.toUpperCase(s.charAt(i+1)) + s.substring(i+2);
                }
            }
        }

        System.out.println(s);


    }




}
