/** @author Elizabeth Norman
 *  Gift class contains the data of the gifts people brought to the party 
 */
public class Gift
{
    private String gift;
    private boolean stolen;

    public Gift(String gift)
    {
        this.gift = gift;

        stolen = false;
    }

    public boolean getStolen() {
        return stolen;
    }

    public void setStolen(boolean stolen) {
        this.stolen = stolen;
    }

    public String getGift()
    {
        return gift;
    }

    @Override
    public String toString()
    {
        return gift;
    }

}
