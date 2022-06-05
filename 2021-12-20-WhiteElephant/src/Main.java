/** @author Elizabeth Norman, @spicedboi
 *
 *
 * Cassidoo Interview Question of the week. December 20, 2021
 *
 * Design a data structure and functions for a white elephant game. You’ll want to have a set of players and gifts they
 * bring, and the gifts they end up with in the end!
 * Rules are from : https://www.whiteelephantrules.com/
 *
 * This was so much fun to code! I loved it. I could definitely add more and make the process more automated by I've
 * already spent enough time on this, I think I have reached a satisfactory end :)
 */


public class Main
{
    public static void main(String [] args)
    {
        //Party begins
        WhiteElephant we = new WhiteElephant();

        //People arrive at party
        Person dave = new Person("Dave", "a puzzle");

        Person sarah = new Person("Sarah", "a mug");

        Person alex = new Person("Alex", "headphones");

        Person victoria = new Person("Victoria", "chocolate bars");

        we.addPerson(dave);
        we.addPerson(sarah);
        we.addPerson(alex);
        we.addPerson(victoria);

        //I don't want to randomize order out of hungover laziness

        we.getFirstGiftList();
        //we.getFirstGiftList();//ensuring that we cannot distribute once game has started

        /* Everyone has their first gift. This is where the fun begins. Or not. I really hate these parties tbh.
         */
        System.out.println("Round one");

        we.trade(dave, alex);
        we.trade(sarah, dave);
        //alex is content
        we.trade(victoria, sarah);

        we.resetRound();

        System.out.println("Round two");
        we.trade(dave, sarah);
        we.trade(sarah, alex);
        we.trade(alex, victoria);
        we.trade(victoria, dave);

        //and we could go on.
    }

}
