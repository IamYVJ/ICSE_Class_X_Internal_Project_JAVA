/**
 * Program to accept the names of 10 cities in a single dimension string array and 
 * their STD (Subscribers Trunk Dialing) codes in another single dimension integer array.
 * Search for a name of a city input by the user in the list.
 * If found, display "Search Successful" and 
 * print the name of the city along with its STD code,
 * or else display the message
 * "Search Unsuccessful, No such city in the list".
 * 
 * ICSE 2012
 */
import java.io.*;
class Search
{
    void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city[] = new String [10];
        int std[] = new int [10];
        boolean check = false;
        for(int i = 0; i<10; i++)
        {
            System.out.print("Enter city name: ");
            city[i] = br.readLine();
            System.out.print("Enter city STD: " + std[i]);
            std[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter a city name to search: ");
        String s = br.readLine();
        for(int i = 0; i<10; i++)
        {
            if(s.equals(city[i]))
            {
                System.out.println("Search Successful");
                System.out.println("City Name: " + city[i]);
                System.out.println("City STD: "+ std[i]);
                check = true;
                break;
            }
        }
        if(check==false)
        {
            System.out.println("Search Unsuccessful, No such city in the list");
        }
    }
}