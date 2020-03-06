/**
 * Program to accept the names of 20 people and display it alphabetically. Use Selection Sort.
 */
import java.io.*;
class SelectionSort
{
    void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String [20];
        for (int i =0; i<20; i++)
        {
            System.out.print("Enter Name: ");
            str[i] = br.readLine();
        }
        for(int i = 0; i<19; i++)
        {
            int p = i;
            for(int j =i+1; j<20; j++)
            {
                if(str[j].compareTo(str[p])<0)
                {
                    p = j;
                }
            }
            String s = str[i];
            str[i] = str[p];
            str[p]  = s;
        }
        for(int i =0; i<20; i++)
            System.out.println(str[i]);
    }
}