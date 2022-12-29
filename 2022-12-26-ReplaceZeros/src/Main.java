/** @Author Elizabeth Norman, Dec 28, 2022
 *
 * Cassidoo Interview Questions December 26th 2022
 *
 * This was a fun start of my goal of practicing more over the winter break. I am content with this solution.
 *
 * This week’s question:
 * Given a string of any length which contains only digits from 0 to 9, replace each consecutive run of the digit 0 with its length.
 *
 * Example:
 *
 * > replaceZeros('1234500362000440')
 * > 1234523623441
 *
 * > replaceZeros('123450036200044')
 * > 123452362344
 *
 * > replaceZeros('000000000000')
 * > 12
 *
 * > replaceZeros('123456789')
 * > 123456789
 */

public class Main
{
    public static void main(String [] args)
    {

        //example cases

        System.out.println(replaceZeros("1234500362000440"));
        System.out.println(replaceZeros("0000000000000000000000000"));
        System.out.println(replaceZeros("12345678900"));
        System.out.println(replaceZeros("1003000050000007000000009000000000"));
    }

    public static String replaceZeros(String x)
    {
        //some variables to track zeros
        int count = 0;
        boolean found = false;
        int start = 0;

        //just one loop, so O(n) :)
        for (int i = 0; i < x.length(); i++)
        {
            //start the count
            if (x.charAt(i) == '0') {
                if (!found)
                    start = i;
                count++;
                found = true;
            }
            else
            {
                found = false;
            }
            //if found is done being true because we've reached the end but we have had 0's, we go into replacing 0s
            //an edge cage is considered for 0's on the end of the string
            if ((!found && count > 0) || (count > 0 && i >= x.length()-1))
            {
                String t = x.substring(start, i); //create a substring of the 0s
                if(i == x.length() - 1)
                    t = t.concat("0"); //an other "end" edge case

                x = x.replaceFirst(t, Integer.toString(count)); //replace the string
                i = i - count; //adjust i as the string will be shrinking
                count = 0; //readjust count
            }
        }

        return x;
    }
}