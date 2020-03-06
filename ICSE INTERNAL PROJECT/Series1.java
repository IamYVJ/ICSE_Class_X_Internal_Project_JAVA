/**
 * Sum of
 * 2-4+6-8+10....n terms
 */
class Series1
{
    void main(int n)
    {
        int sum = 0;
        int sign = 1;
        for(int i =1; i<=n; i++)
        {
            sum+=(i*2*sign);
            sign*=(-1);
        }
        System.out.println("Sum is: " + sum);
    }
}