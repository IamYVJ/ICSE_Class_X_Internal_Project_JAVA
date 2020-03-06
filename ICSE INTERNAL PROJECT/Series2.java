/**
 * Program to print the sum of the following series upto 'n'
 * (x^2) + (x^3)/2 + 2(x^4)/6 + 3(x^5)/24 + 5(x^6)/120 ... n terms
 */
class Series2
{
    void main(int x, int n)
    {
        double sum = 0;
        int d = 1;
        int a = 0, b = 0, c = 1;
        for(int i = 1; i<=n; i++)
        {
             d*=i;
             double term = c*Math.pow(x,i+1)/d;
             sum+=term;
             a = b;
             b = c;
             c = a + b;
        }
        System.out.println("Sum is: " + sum);
    }
}