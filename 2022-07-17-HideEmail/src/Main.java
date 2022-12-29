/** Cassidoo Interview Question July 17th, 2022
 *
 * @author  Elizabeth Norman
 *
 * This one was very straightforward and easy to do, I am quite happy with this. If I knew of a better way to create
 * the * string, I could complexity even more but alas I do not. 
 *
 * Given a string that has a valid email address, write a function to hide the first part of the email (before the @
 * sign), minus the first and last character. For extra credit, add a flag to hide the second part after the @ sign to
 * your function excluding the first character and the domain extension.
 *
 * Examples:
 *
 * > hideEmail('example@example.com')
 * > 'e*****e@example.com'
 *
 * > hideEmail('example+test@example.co.uk', hideFull)
 * > 'e**********t@e******.co.uk'
 */

public class Main
{
    public static void main (String [] args)
    {
        //Working examples
        System.out.println(hideEmail("example@example.com",true));
        System.out.println(hideEmail("british@gmail.co.uk",false));
        System.out.println(hideEmail("britishmail@gmail.co.uk", true));

        //Incorrect input examples
        System.out.println(hideEmail("britishmail@gmailcouk", true));
        System.out.println(hideEmail("eee", false));
    }

    public static String hideEmail(String e, boolean flag)
    {
        int index = e.indexOf("@");

        //if @ isn't in email, not email
        if (index > 0)
        {
            String toReplace = e.substring(1,index-1);

            String stars = createStars(toReplace.length());
            e = e.replaceFirst(toReplace,stars);

            if (flag)
            {
                String emailExt = e.substring(index+1);
                int index2 = emailExt.indexOf(".");

                // check for valid email again
                if (index2 > 0)
                {
                    emailExt = emailExt.substring(1, index2);
                    String stars2 = createStars(emailExt.length());
                    e = e.replace(emailExt, stars2);
                }
                else
                {
                    return "Not an email";
                }

            }
            return e;
        }
        else
        {
            return "Not an email";
        }
    }

    /*
        Little helper function to create the replacement strings
     */
    public static String createStars(int a)
    {
        String temp = "";
        for (int i = 0; i < a; i++)
        {
            temp = temp.concat("*");
        }
        return temp;
    }



}
