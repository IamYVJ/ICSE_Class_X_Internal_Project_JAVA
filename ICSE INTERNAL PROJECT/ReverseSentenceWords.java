/**
 * Program to reverse a sentence as a whole
 */
class ReverseSentenceWords
{
    void main(String s)
    {
        s = s + " ";
        String rev = "";
        String w="";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
                w = s.charAt(i) + w;
            else
            {
                rev = w + " " + rev;
                w = "";
            }
        }
        System.out.println(rev);
    }
}

            