
/**
 * Program to find the Highest & Lowest Digit in a number and also their positions
 */
class HighestLowestDigit
{
    void main(int n)
    {
        int h = 0;
        int l = 9;
        int p = 0;
        int hp = 0; 
        int lp = 0;
        n = Math.abs(n);
        if(n!=0)
        {
            while (n > 0 )
            {
                int d = n % 10;
                if (d > h)
                {
                    h = d;
                    hp = p;
                }
                if (d < l)
                {
                    l = d;
                    lp = p;
                }
                p++;
                n/=10;
            }
        }
        else
        {
            h=0;
            l=0;
        }
        System.out.println("The Highest Digit Is " + h + " And It Is At The " + (int)Math.pow(10,hp) + "s Place");
        System.out.println("The Lowest Digit Is " + l + " And It Is At The " + (int)Math.pow(10,lp) + "s Place");
        }
    }

         