/**
 *
 */

public class Person
{
    private String name;
    private String theirGift; //we want to keep track of the gift they brought, as they won't take it
    private Gift gift; //this is the gift they will walk home with

    public Person(String name, String gift)
    {
        this.name = name;
        this.theirGift = gift;
        gift = null;

    }

    public String getTheirGift()
    {
        return theirGift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    @Override
    public String toString()
    {
        return name + " has " + gift;
    }
}
