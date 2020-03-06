
/**
 * x + (x^2)/2! + (x^3)/3! ... (x^n)/n!
 */
class Series3
{
    int fact(int n)
    {
        int f = 1;
        for(int i = 1;i<=n; i++)
            f*=i;
        return f;
    }

    void main(int x, int n)
    {
        double sum = 0.0;
        for(int i = 1; i<=n; i++)
        {
            double d = Math.pow(x,i)/fact(i);
            sum+=d;
        }
        System.out.println("Sum is: " + sum);
    }
}