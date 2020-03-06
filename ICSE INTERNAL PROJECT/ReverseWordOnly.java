/**
 * Program to reverse the words in a sentence
 */
class ReverseWordOnly
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
                rev = rev + w + " ";
                w = "";
            }
        }
        System.out.println(rev);
    }
}

            