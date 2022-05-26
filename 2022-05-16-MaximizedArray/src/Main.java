import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

/** @Author Elizabeth Norman, @spicedboi
 * I think this answer is so stupid, lmao. I'd like to come back to it if I get some inspiration, but at least this is
 * O(N) and works! We add the two arrays together and then return the top, unique elements.
 *
 * Cassidoo Interview Question, May 16th
 * This week’s question:
 * Given two integer arrays of size n, return a new array of size n such that n consists of only unique elements and
 * the sum of all its elements is maximum.
 *
 * Example:
 *
 * let arr1 = [7, 4, 10, 0, 1]
 * let arr2 = [9, 7, 2, 3, 6]
 *
 * $ maximizedArray(arr1, arr2)
 * $ [9, 7, 6, 4, 10]
 *
 */

public class Main
{
    public static void main(String [] args)
    {
        int[] a1 = {7,4,10,0,1};
        int[] a2 = {9,7,2,3,6};

        ArrayList<Integer> ra = maximizedArray(a1, a2);
        System.out.println(ra);
    }

    public static ArrayList<Integer> maximizedArray(int[] a1, int[] a2)
    {
        ArrayList<Integer> ra = new ArrayList<Integer>();

        for (int i = 0; i < a2.length; i ++)
        {
            ra.add(a2[i]);
        }
        for (int i = 0; i < a1.length; i++)
        {
            ra.add(a1[i]);
        }
        Collections.sort(ra);

        ArrayList<Integer> raa = new ArrayList<Integer>();

        for (int i = ra.size()-1; i >= a1.length - 1; i --)
        {
            if (raa.contains(ra.get(i)))
                continue;
            else
                raa.add(ra.get(i));
        }
        return raa;
    }

}
