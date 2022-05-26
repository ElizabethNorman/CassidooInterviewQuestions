/** @author  Elizabeth Norman @spicedboi
 * Cassido Interview Question: April 17th, 2022
 * Given an unsorted array of integers and a number n, find the subarray of length n that has the largest sum.
 * Input: int[] x = {3,1,4,1,2,3,4,6, 4, 2, 3, 4};
 * largestSubarray(x, 4);
 * Output: 3 4 6 4
 */

public class Main
{
    public static void main (String [] args)
    {
        int[] x = {3,1,4,1,2,3,4,6, 4, 2, 3, 4};
        largestSubarray(x, 4);
        int[] y = {3,4,7,8,1,2,3};
        largestSubarray(y, 2);
    }

    public static void largestSubarray(int [] list, int x)
    {
        int sum = 0;
        int highest = 0;
        int [] ar = new int[x];

        for (int i = 0; i < list.length - x + 1; i++)
        {
            //calculuate the sum of the current subarray
            for (int j = 0; j < x; j ++)
            {
                sum += list[i + j];
            }

            //if that subarray is the highest so far, fill in array
            if (sum > highest)
            {
                highest = sum;
                for (int j = 0; j < x; j++)
                {
                    ar[j] = list[i + j];
                }
            }
            //reset sum back to 0
            sum = 0;
        }

        //finally print out the array
        for (int i = 0; i < ar.length; i ++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

    }

}
