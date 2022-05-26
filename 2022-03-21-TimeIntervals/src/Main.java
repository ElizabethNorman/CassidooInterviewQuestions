/** @author Elizabeth Norman, @spicedboi
 *  Cassido Interview Question: March 21st 2022
 *   Given a list of times in a 24-hour period, return the smallest interval between two times in the list.
 *   Hint: you can do this in O(n) time! Assume the list is unsorted.
 *   Example:  $ smallestTimeInterval(['01:00', '08:15', '11:30', '13:45', '14:10', '20:05'])
 *   $ '25 minutes'
 *   Java:
 *   String [] time = {"08:15", "11:30", "14:10", "20:15"};
 *   smallestTimeInterval(time); // prints out : Lowest is: 2 hours adn 40 minutes
 */

import java.util.Arrays;

public class Main
{
    public static void main(String [] args)
    {
        String [] time = {"08:15", "11:30", "14:10", "20:15"};
        smallestTimeInterval(time);
    }

    public static void smallestTimeInterval(String[] times)
    {
        //convert time
        int [] converted = new int[times.length];
        for (int i = 0; i < times.length; i ++)
        {
            converted[i] = convertTimeToInt(times[i]);
        }
        //sort times
        Arrays.sort(converted);

        //calculate the difference
        int maxTime = 1440; //there are 1440 minutes in a day, thus no difference can exceed it
        int lowest = maxTime;
        int difference = 0;

        for (int i = 1; i < converted.length - 1; i ++)
        {
            difference = Math.abs(converted[i] - converted[i-1]);
            if (difference < lowest)
                lowest = difference;
            difference = Math.abs(converted[i] - converted[i+1]);
            if (difference < lowest)
                lowest = difference;
        }
        System.out.println("Lowest is: " + convertIntToTime(lowest) );
    }

    /*
    Helper method for the smallestTimeInterval method
     */
    public static int convertTimeToInt(String time)
    {
        String[] splitTime = time.split(":");
        int x = Integer.parseInt(splitTime[0]);
        x = x * 60;
        x = x + Integer.parseInt(splitTime[1]);
        return x;
    }

    /*
    Helper method for the smallestTimeInterval method
     */
    public static String convertIntToTime(int t)
    {
        StringBuilder sb = new StringBuilder();
        int hours = t/60;
        int minutes = t%60;
        if(hours > 0)
        {
            sb.append(hours);
            sb.append(" hours ");
            if (minutes > 0)
                sb.append("and ");
        }
        if (minutes > 0)
        {
            sb.append(minutes);
            sb.append(" minutes");
        }
        String converted = sb.toString();
        return converted;
    }
}
