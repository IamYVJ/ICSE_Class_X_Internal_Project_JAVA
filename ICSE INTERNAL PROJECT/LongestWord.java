/**
 * Program to find the longest word in a sentence
 */
class LongestWord
{
    void main(String s)
    {
        String w = "";
        String lw = "";
        s = s + " ";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                w = w + s.charAt(i);
            }
            else
            {
                if(w.length()>lw.length())
                {
                    lw = w;
                }
                w = "";
            }
        }
        System.out.println(lw);
    }
}        
