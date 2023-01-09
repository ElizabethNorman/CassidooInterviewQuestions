/** @author Elizabeth Norman
 *
 * Simple O(N) answer. Wanted to go to bed, saw the email pop up and had to get it answered right away lol
 *
 * Cassidoo Interview Question January 8th
 * This week’s question:
 * Given a number, sum every second digit in that number.
 *
 * Example:
 *
 * > sumEveryOther(548915381)
 * > 26 // 4+9+5+8
 *
 * > sumEveryOther(10)
 * > 0
 *
 * > sumEveryOther(1010.11)
 * > 1 // 0+0+1
 */


public class Main
{
    public static void main (String [] args)
    {
        sumEveryOther(1111);
        sumEveryOther(548915381);
        sumEveryOther(10);
        //not dealing with her decimal example I know it would work if I switched up types but I need to go to bed lol
    }

    public static int sumEveryOther(int n)
    {
        String s = Integer.toString(n);
        System.out.println(s);
        int sum = 0;
        for (int i = 1; i < s.length(); i += 2)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                sum += Integer.parseInt(Character.toString(s.charAt(i))); //ahhhhh java....
            }
        }
        System.out.println(sum);

        return sum;
    }



}
