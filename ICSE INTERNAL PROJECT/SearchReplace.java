/**
 * Input A String (a)
 * Find A String (b) Inside The Inputted String (a)
 * Replace The Found (b) String With Another String (c) in The Inputted String (a)
 * Print The Final String (d)
 */
import java.io.*;
class SearchReplace
{
    void display() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter Source String: ");
        String a = br.readLine();
        System.out.print("Enter Search String: ");
        String b = br.readLine();
        System.out.print("Enter Replace String: ");
        String c = br.readLine();
        String d = "";
        int ax = a.length();
        int bx = b.length();
        for(int i = 0; i<ax; i++)
        {
            if(a.charAt(i)==b.charAt(0))
            {
                String z = a.substring(i,i+bx);
                if (z.compareTo(b)==0)
                {
                    d = a.substring(0,i) + c + a.substring(i+bx);
                    System.out.println("Final String: " + d);
                }
            }
        }
    }
}

    