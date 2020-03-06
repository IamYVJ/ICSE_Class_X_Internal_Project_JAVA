
/**
 * PIGLATIN CONVERSION
 */
class Piglatin
{
    void main(String s)
    {
        boolean flag = false;
        s = s.toUpperCase();
        String p = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)== 'E' || s.charAt(i) == 'I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                p = s.substring(i) + s.substring(0,i) + "AY";
                flag = true;
                break;
            }
        }
        if (flag==false)
            p = s+"N";
        System.out.println(p);
    }
}
