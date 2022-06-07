import java.util.ArrayList;


/** @Author Elizabeth Norman
 *
 *
 * Cassidoo Interview Question January 10th, 2022
 *
 * Given a string s, you can transform every letter individually to be lowercase or uppercase. Return a list of all
 * possible permutations you could create from s.
 *
 * Example:
 *
 * $ capPermutations("ab2")
 * $ ["ab2","aB2","Ab2","AB2"]
 *
 * $ capPermutations("35p")
 * $ ["35p","35P"]
 */

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> answer = new ArrayList<String>();
        String s = "ab2";
        answer = capPermutations(s.toLowerCase().toCharArray(), 0, s.length(), answer);
        System.out.println(answer);

        s = "aaa222aaa";
        answer = capPermutations(s.toLowerCase().toCharArray(), 0, s.length(), answer);
        System.out.println(answer);
    }

    public static ArrayList<String> capPermutations(char[] ca, int i, int l, ArrayList<String> an)
    {
        if (i < l)
        {
            capPermutations(ca, i + 1, l, an);
            if (Character.isLetter(ca[i]))
            {
                ca[i] = Character.toUpperCase(ca[i]);
                capPermutations(ca, i + 1, l, an);
                ca[i] = Character.toLowerCase(ca[i]);
            }
        }
        else
        {
            an.add(new String(ca));
        }

        return an;

    }
}
