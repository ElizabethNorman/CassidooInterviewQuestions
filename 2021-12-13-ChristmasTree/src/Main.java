/** @Author Elizabeth Norman, @spicedboi
 *
 * Cassidoo Interview Question December 13 2021
 *
 * Given a file named merry-christmas.txt that has a single integer x in it, write a script to generate a Christmas tree
 * with asterisks (*) and output it as happy-holidays.txt. The tree should have a height of x, and if merry-christmas.txt
 * is empty, the height should be 25 asterisks tall.
 *
 * Example (you can be flexible with your output, but this might be helpful for you as a starting point):
 *
 * // merry-christmas.txt
 * 3
 *
 * // happy-holidays.txt
 *   *
 *  ***
 * *****
 *
 * Note from me: This is really poor form, when I was done I realized that I should have absolutely done this in a new
 * class instead of main for the print writer stuff. So let this comment show my intent to do things properly instead
 * of actually doing it ;)
 */

import java.io.*;
import java.util.Scanner;

public class Main
{

    //dumb, bad, won't do this again
    static File output = new File("happy-holidays.txt");
    static PrintWriter writer;

    static {
        try {
            writer = new PrintWriter(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("merry-christmas.txt"));
        int x = 25; //initialize at 25, only change if .txt file isn't empty
        if (sc.hasNextLine())
            x = Integer.parseInt(sc.nextLine());
        tree(x,x);
        sc.close();
        writer.close();
    }

    //print the spaces needed for the pyramid
    public static void space(int height)
    {
        if (height == 0)
            return;
        writer.print(" ");
        space(height - 1);

    }

    //print appropriate no of stars
    public static void star(int height)
    {
        if (height == 0)
            return;
        writer.print("* ");

        star(height - 1);
    }

    //main tree recursive method
    public static void tree(int height, int i)
    {
        if (height == 0)
            return;

        space(height - 1 );
        star(i - height + 1);

        writer.println();

        tree(height - 1, i);
    }


}
