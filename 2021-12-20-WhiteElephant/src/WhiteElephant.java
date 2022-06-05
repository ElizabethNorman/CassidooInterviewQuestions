/** @author Elizabeth Norman
 * The white elephant class is where the party game is done
 * 
 */
import java.util.ArrayList;
import java.util.Random;

public class WhiteElephant
{

    private ArrayList<Person> people;
    private ArrayList<Gift> gifts; //keeps track of the gifts to be picked up during initial distribution
    private int count;
    private boolean gameStarted;

    public WhiteElephant()
    {
        people = new ArrayList<Person>();
        gifts = new ArrayList<Gift>();
        count = 0;
        gameStarted = false;
    }

    public void addPerson(Person person)
    {
        people.add(person);
        gifts.add(new Gift(person.getTheirGift()));
        System.out.println(person.getName() + " has arrived and they brought " + person.getTheirGift());
        count++;
    }


    /* To reset the stolen boolean for the next round of trading
     * 
     */
    public void resetRound()
    {
        for(Gift gift : gifts)
        {
            gift.setStolen(false);
        }
    }

    /* Below I demonstrate how to handle what to do if a person gets their original gift
       While we could add them in here, I really didn't think it necessary to code again, the person
       should know not to grab their own gift 

     */
    public void trade(Person taker, Person taken)
    {
        if (taken.getGift().getStolen())
        {
            System.out.println(taken.getGift() +  " has/have already been stolen this round");
            return;
        }

        Gift temp = taken.getGift();
        temp.setStolen(true);
        taken.setGift(taker.getGift());
        taker.setGift(temp);
        System.out.println(taker.getName() + " took " + taken.getName() + "'s " + taker.getGift() + " in exchange for "
                + taken.getGift());
    }

    public void getFirstGiftList()
    {
        for(Person person : people)
        {
            getFirstGiftPerson(person);
        }
    }

    /* The first gift methods are separated because of the recursive call we make to this method when a person
       picks up their original gift.
     */
    public void getFirstGiftPerson(Person person)
    {
        if(!gameStarted) //if the game has begun, then people cannot get their first gifts
        {
            Random r = new Random();
            Gift g = gifts.get(r.nextInt(gifts.size()));
            person.setGift(g);

            gifts.remove(g);
        }
        else
        {
            System.out.println("First distribution has started. Cannot call this method.");
            return;
        }

        //recursive call to get a person a gift that was not the one they brought
        if (person.getGift().equals(person.getTheirGift()))
        {
            gifts.add(person.getGift());
            getFirstGiftPerson(person);
        }

        System.out.println(person.getName() + " picked up " + person.getGift());

        if (gifts.isEmpty())
            gameStarted = true;

    }




}
