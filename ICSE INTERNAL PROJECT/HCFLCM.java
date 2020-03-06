/**
 * Program to find the HCF & LCM of two numbers
 */
class HCFLCM
{
    int hcf(int a, int b)
    {
        int h=1;
        if(b>a)
        {
            a = a+b;
            b = a - b;
            a = a - b;
        }
        for(int i = 1;i<=b;i++)
        {
            if (a%i==0 && b%i==0)
            {
                h=i;
            }
        }
        return h;
    }

    void main (int a, int b)
    {
        int h = hcf(a,b);
        System.out.println("The H.C.F. Is " + h);
        System.out.println("The L.C.M. Is " + (a*b)/h);
    }
}


    