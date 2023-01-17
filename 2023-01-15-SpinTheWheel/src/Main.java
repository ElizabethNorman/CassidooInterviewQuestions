import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/** @author Elizabeth Norman, @spicedboi
 *
 * Cassidoo Interview Question January 15th 2023
 *
 * This week’s question:
 * Implement a “spin the wheel” game where the player can bet on each spin of a wheel and either double their money,
 * lose their money, or keep their money. You can choose how the user bets, and what data structures you might want
 * to use for the player and their money!
 */

public class Main
{
    public static void main (String [] args) throws IOException {
        //Dave comes to play with 2 hundo bucks
        Wheel spinner = new Wheel(200);

        System.out.println("Press any key to start playing with $200");
        System.in.read();
        System.out.println("Starting");

        while(!spinner.hasLost())
        {
            spinner.spin();
            if (spinner.hasLost())
            {
                System.out.println("You have lost. Press any key to exit");
            }
            else
            {
                System.out.println("Press any key to spin again");
            }
            System.in.read();
        }

        System.out.println("Thanks for playing!");


    }

}
