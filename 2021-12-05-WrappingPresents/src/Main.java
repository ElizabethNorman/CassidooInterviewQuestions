/** @author Elizabeth Norman, @spicedboi
 *
 * This week’s question:
 *You have to order wrapping paper for presents. Given the length, width, and height of the boxes you need to wrap,
 * return the number of square feet (or whatever units you want) of wrapping paper you need to order.
 * Extra credit: allow for other shapes of presents and their dimensions!
 *
 * Example:
 *
 * $ wrap(2, 3, 4)
 * $ 52 square feet
 */

public class Main
{

    public static void main(String [] args)
    {
        //wrapping the usual box:
        System.out.println(wrapBox(2,3,4) + " square feet");
        //wrapping up a cylinder:
        System.out.println(wrapCylinder(2,3) + " square feet");

    }

    //Easy-peasy!
    public static int wrapBox(int h, int l, int w)
    {
        return 2 * ((w*h) + (l*w) + (h*l));
    }

    //One for extra credit
    public static double wrapCylinder(int r, int h)
    {
        return (2* Math.PI * r * h) + (2*Math.PI*r*r);
    }

    //we could keep going for more extra credit, but I think you get the gist

}
