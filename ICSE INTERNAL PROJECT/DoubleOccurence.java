/**
 * Program to Print all the Double Occurences in a String
 * 
 */
import java.io.*;
class DoubleOccurence
{
    void display() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter String: ");
        String a = br.readLine();
        int ax = a.length();
        for (int i = 0; i<ax-1; i++)
        {
            if (a.charAt(i)== a.charAt(i+1))
            {
                String c = a.substring(i,i+2);
                System.out.println(c);
            }
        }
    }
}

