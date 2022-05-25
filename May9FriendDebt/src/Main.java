import java.util.HashMap;
import java.util.Map;

/** @author Elizabeth Norman, @spicedboi
 * May 9th, Cassidoo Interview Question
 * Description from newsletter:
 * This week’s question:
 * You went on a vacation with friends. Each of you paid for certain meals on the trip for the group.
 * Write a function that determines who owes money to whom so that everyone pays equally.
 *
 * Example:
 *
 * let receipts = [
 *   { name: 'Ximena', paid: 45 },
 *   { name: 'Clara', paid: 130 },
 *   { name: 'Ximena', paid: 100 },
 *   { name: 'Cassidy', paid: 140 },
 *   { name: 'Cassidy', paid: 76 },
 *   { name: 'Clara', paid: 29 },
 *   { name: 'Ximena', paid: 20 },
 * ]
 *
 * $ whoOwes(receipts)
 * $ 'Clara owes Cassidy $21, Ximena owes Cassidy $15'
 *
 */

public class Main
{
    public static void main (String [] args)
    {
        /* The given example utilizes a library, so to convert to Java I will use a Hashmap.
         * Hashmaps cannot have duplicate keys, so I added the duplicate keys together
         * as I didn't feel dealing with that issue was within the scope of the question
         */

        Map<String, Double> map = new HashMap();
        map.put("Ximena", 165.0);
        map.put("Clara", 159.0);
        map.put("Cassidy", 216.0);
        owe(map);

        System.out.println("");

        Map<String, Double> map2 = new HashMap<>();
        map2.put("Pete", 70.0);
        map2.put("Sam", 65.0);
        map2.put("Dave", 60.0);
        map2.put("Sarah", 100.0);
        map2.put("Alex", 85.0);

        owe(map2);


    }

    public static void owe(Map<String, Double> map)
    {

        //Find the average that each person should have paid
        int sum = 0;
        for (var value : map.values())
        {
            sum += value;
        }
        int avg = sum / map.size();


        //find total overage

        int overage = 0;

        for (var value : map.values())
        {
            if (value > avg)
            {
                overage += (value - avg);
            }
        }

        //Find proportions for the overpaid folks, store in a new hashmap

        Map<String, Double> overageMap = new HashMap<>();

        for (Map.Entry<String, Double> entry: map.entrySet())
        {
            if (entry.getValue() > avg)
            {
                overageMap.put(entry.getKey(), ((entry.getValue()-avg) / overage));
            }
        }

        //iterate through original map, find the under folks, calculate what they owe, print to screen
        for (Map.Entry<String, Double> entry: map.entrySet())
        {
            if (entry.getValue() < avg)
            {
                for (Map.Entry<String, Double> entry2: overageMap.entrySet())
                {
                    double totalOwe = (avg-entry.getValue()) * entry2.getValue();
                    String result = String.format("%.2f", totalOwe);
                    System.out.print(entry.getKey() + " owes " + entry2.getKey() + " $" + result);
                    System.out.println("");
                }
            }
        }

    }
}
