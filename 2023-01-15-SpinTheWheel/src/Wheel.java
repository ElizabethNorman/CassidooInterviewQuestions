import java.util.Random;

public class Wheel
{
    private int cash;
    private Random randy = new Random();

    public Wheel(int cash)
    {
        this.cash = cash;

    }

    public void spin()
    {
        int result = randy.nextInt(100) + 1;

        // 50% keep, 40% double, 10% lose
        if (result > 60)
        {
            cash = cash*2;
            System.out.println("doubled! $" + cash);

        }
        else if (result > 10)
        {
            System.out.println("keep! $" + cash);
        }
        else
        {
            cash = 0;
            System.out.println("Lose! $" + cash);
        }
    }

    public boolean hasLost()
    {
        return cash <= 0;
    }

}
