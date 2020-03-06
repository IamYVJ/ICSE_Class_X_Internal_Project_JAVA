/**
 * Remove all the Double Occurences in a String to a Single Occurence
 * 
 */
import java.io.*;
class RemoveDoubleOccurence
{
    void display() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter String: ");
        String a = br.readLine();
        String b = "";
        int i =0;
        while(i<a.length()-1)
        {
            if (a.charAt(i)== a.charAt(i+1))
            {
                b = a.substring(0,i)+a.substring(i+1);
                a=b;
            }
            i++;
        }
        System.out.println(b);
   }
}
