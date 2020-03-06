/**
 * Program to generate all twin primes upto n
 */
class TwinPrime
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
        for(int i = 2; i<=n; i++)
        {
            if(checkPrime(i) && checkPrime(i+2))
                System.out.println(i + " " + (i+2));
        }
    }
}
