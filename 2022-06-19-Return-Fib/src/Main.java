/** @author Elizabeth Norman, @spicedboi
 *
 * Cassidoo Interview Question June 19th 2022
 * This week’s question:
 * Given a Fibonacci number, give the previous Fibonacci number.
 * If the number given is not a Fibonacci number, return -1.
 */

public class Main
{
    public static void main (String [] args)
    {
        int x;
        x = returnFib(5);
        System.out.println(x);
        x = returnFib(6); //returns -1
        System.out.println(x);
        x = returnFib(8); //returns 5
        System.out.println(x);
        x = returnFib(13); //returns 8
        System.out.println(x);
        x = returnFib(21);
        System.out.println(x);
    }

    public static int returnFib(int x)
    {
        //a simple, non recursive fibonacci function
        int n1 = 0;
        int n2 = 1;
        int n3;

        for (int i = 2; i <= x; i++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if (n3 == x) //if the number matches the given one, return the previous number
            {
                return n1;
            }
        }
        //if loop is done, then it wasn't a fib number, so return -1
        return -1;
    }
}
