import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;


/** @Author Elizabeth Norman, @spicedboi
 * This one was tricky! I did have to do some research... shame. But I think I get it now!
 *
 * Cassidoo Interview Question April 24 2022
 *
 * This week’s question:
 * Given an array of intervals, merge the overlapping intervals, and return an array of the resulting intervals.
 *
 * Example:
 *
 * $ mergeIntervals([[1,4],[2,6],[8,10],[15,20]])
 * $ [[1,6],[8,10],[15,20]]
 *
 * $ mergeIntervals([[1,2],[2,7]])
 * $ [[1,7]]
 */


public class Main
{
    public static void main(String [] args)
    {
        int[][] t = {{1,4},{2,6}, {10, 15}, {14,20}};
        int[][] x = mergeIntervals(t);

        System.out.println(x[0][0] + " " + x[0][1]);
        System.out.println(x[1][0] + " " + x[1][1]);

    }

    public static int[][] mergeIntervals(int[][] t)
    {
        //if the double array is of size 1 or 0, return
        if (t.length <= 1 )
            return t;

        //sort the provided double array by the first value
        Arrays.sort(t, Comparator.comparingInt(i -> i[0]));

        //create a linked list, we do this so we can access the getLast() method
        LinkedList<int[]> merged = new LinkedList<>();

        //for each array in our double array
        for (int[] ti : t)
        {
            //if merged is empty or if last of merged is less than ti's first member, add to merged
            if (merged.isEmpty() || merged.getLast()[1] < ti[0])
            {
                merged.add(ti);
            }
            else //else last of merged is changed to the max between last or ti's[1]
            {
                merged.getLast()[1] = Math.max(merged.getLast()[1], ti[1]);
            }
        }
        //return merged but converted to double array
        return merged.toArray(new int[merged.size()][]);
    }


}
