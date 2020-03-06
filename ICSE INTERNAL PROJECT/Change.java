/**
 * Program to accept a word and convert it into lowercase if it is in uppercase, and display the new word by replacing only the vowels with the character following it.
 * Sample Input: computer
 * Sample Output: cpmpvtfr
 * 
 * ICSE 2011
 */
import java.util.*;
class Change
{
    void main()
    {
        String s = "";
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter word: ");
        String word = sc.next();
        word = word.toLowerCase().trim();
        for(int i = 0; i<word.length(); i++)
        {
            int ch = (int)word.charAt(i);
            if(ch==97 || ch ==101 || ch==105 || ch==111 || ch==117)
                ch++;
            s+=((char)ch);
        }
        System.out.print("Changed word: " + s);
    }
}