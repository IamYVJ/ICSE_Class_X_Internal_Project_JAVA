 
/**
 * Program to find the nearest prime number from the number entered by the user
 */
class NearestPrime
{
    boolean checkPrime(int x)
    {
        for(int i= 2; i<=x/2; i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }

    void main(int n)
    {
        boolean ch = false;
        int i = 1;
        do
        {
            if(checkPrime(n+i))
            {
                System.out.println(n+i);
                ch = true;
            }
            if(checkPrime(n-i))
            {
                System.out.println(n-i);
                ch = true;
            }
            i++;
        }
        while(ch==false);
    }
}

    