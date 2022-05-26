/** @author Elizabeth Norman, @spicedboi
 *
 * May 2nd Cassidoo interview question
 * This week’s question:
 * Implement a simple version of autocomplete, where given an input string s and a dictionary of words dict, return the
 * word(s) in dict that partially match s (or an empty string if nothing matches).
 *
 * Example:
 *
 * let dict = ['apple', 'banana', 'cranberry', 'strawberry']
 *
 * $ simpleAutocomplete('app')
 * $ ['apple']
 *
 * $ simpleAutocomplete('berry')
 * $ ['cranberry', 'strawberry']
 *
 * $ simpleAutocomplete('fart')
 * $ []
 */

import java.util.ArrayList;

public class Main
{
    public static void main (String [] args)
    {
        ArrayList<String> result = simpleAutocomplete("app");
        System.out.println(result);
        result = simpleAutocomplete("berry");
        System.out.println(result);
        result = simpleAutocomplete("fart");
        System.out.println(result);
    }


    public static ArrayList<String> simpleAutocomplete(String s)
    {
        ArrayList<String> results = new ArrayList<String>();
        String [] dictionary = {"apple", "banana", "cranberry", "strawberry"};

        for (int i = 0; i < dictionary.length; i ++)
        {
            if (dictionary[i].contains(s))
                results.add(dictionary[i]);
        }

        return results;
    }

}
