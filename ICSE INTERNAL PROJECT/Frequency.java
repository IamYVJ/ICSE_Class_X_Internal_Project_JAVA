/**
 * Program to input a string in uppercase and find the frequency of each character.
 * Example:
 *   Input: COMPUTER HARDWARE
 *   Output: 
 *         CHARACTERS     FREQUENCY
 *             A              2
 *             C              1
 *             D              1
 *             E              2
 *             H              1
 *             M              1
 *             O              1
 *             P              1
 *             R              3
 *             T              1
 *             U              1
 *             W              1
 *             
 *  ICSE 2010
 */
import java.io.*;
class Frequency
{
    void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");              
        String s = br.readLine().toUpperCase().trim();
        System.out.println("\n   CHARACTER" + "  FREQUENCY");
        for(int i = 65; i<=90; i++)
        {
            int f = 0;
            for(int j = 0; j<s.length(); j++)
            {
                if(((int)(s.charAt(j)))==i)
                {
                    f++;
                }
            }
            if(f>0)
            {
                System.out.println("\t" + (char)i + "\t  " + f);
            }
        }
    }
}
        