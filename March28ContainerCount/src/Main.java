/** @author Elizabeth Norman, @spicedboi
    Cassido Interview Question March 28th, 2022
    Given a string that represents items as asterisks (*) and compartment walls as pipes (|), a start index,
    and an end index, return the number of items in a closed compartment.
    Example call:  containerCount("|*|**|*|", 0, 6); // returns 3
 */

public class Main
{

    public static void main(String [] args)
    {
        int x = containerCount("|*|**|*|", 0, 6);
        System.out.println(x);
        int y = containerCount("||***|*",0, 6);
        System.out.println(y);
    }

    public static int containerCount(String s, int start, int end)
    {
        boolean started = false;
        int count = 0;
        int tempC = 0;
        for (int i = 0; i <= end; i++)
        {
            //we start our count when we reach a |
            if (s.charAt(i) == '|' && !started)
            {
                started = true;
                continue;
            }
            //when we find a star, we increase temp count
            if (s.charAt(i) == '*' && started)
            {
                tempC += 1;
            }
            //we only add onto the final count if we reach a closing |
            if (s.charAt(i) == '|' && started)
            {
                count += tempC;
                tempC = 0;
            }
        }
        return count;
    }
}
