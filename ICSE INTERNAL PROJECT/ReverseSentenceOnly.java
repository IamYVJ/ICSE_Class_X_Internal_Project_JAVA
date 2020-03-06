/**
 * Program to reverse a sentence not the words
 */
class ReverseSentenceOnly
{
    void main(String s)
    {
        s = s + " ";
        String rev = "";
        String w="";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
                w = w + s.charAt(i);
            else
            {
                rev = w + " " + rev;
                w = "";
            }
        }
        System.out.println(rev);
    }
}

            