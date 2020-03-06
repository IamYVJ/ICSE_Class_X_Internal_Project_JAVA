/**
 * Program to print 'n' fibonacii terms in reverse order
 */
class ReverseFibonacii
{
    void main(int n)
    {
        int a = 0, b = 1, c = 0;
        for(int i =1; i<=n; i++)
        {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println("The Reverse Order:");
        for(int i = 1; i<=n; i++)
        {
            System.out.println(c);
            c = b;
            b = a;
            a = c-b;
        }
    }
}