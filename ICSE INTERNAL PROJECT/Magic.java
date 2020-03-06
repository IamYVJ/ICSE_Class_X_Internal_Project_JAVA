/**
 * Program to check if inputted number is a Magic Number
 * A Magic Number is a number whose digital sum is 1
 */
class Magic
{
    int sumOfDigits(int x)
    {
        int s = 0;
        while (x>0)
        {
            int d  = x % 10;
            s+=d;
            x/=10;
        }
        return s;
    }

    void main(int n)
    {
        while (n>9)
        {
            n = sumOfDigits(n);
        }
        if (n==1)
            System.out.println("It Is A Magic Number");
        else
            System.out.println("It Is Not A Magic Number");
    }   
}
