import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

/** @Author Elizabeth Norman, @spicedboi
 * I think this answer is so stupid, lmao. I'd like to come back to it if I get some inspiration, but at least this
 * isn't computationally expensive and does work! We add the two arrays together and then return the top, unique elements.
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

    /* Base on the phrasing of the question I am not worrying about the case where two given arrays are of different
     * length
     *
     */
    public static ArrayList<Integer> maximizedArray(int[] a1, int[] a2)
    {
        ArrayList<Integer> joinedArray = new ArrayList<Integer>();

        for (int i = 0; i < a2.length; i ++)
        {
            joinedArray.add(a2[i]);
            joinedArray.add(a1[i]);
        }

        Collections.sort(joinedArray);

        ArrayList<Integer> returnArray = new ArrayList<Integer>();

        for (int i = joinedArray.size()-1; i >= a1.length - 1; i --)
        {
            if (returnArray.contains(joinedArray.get(i)))
                continue;
            else
                returnArray.add(joinedArray.get(i));
        }
        return returnArray;
    }

}
