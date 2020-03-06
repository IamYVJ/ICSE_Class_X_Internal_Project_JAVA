
/**
 * Program to print the following pattern:
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1 
 * 
 */
class Pattern
{
    void main()
    {
        int a[] = new int [5];
        int gap = 4;
        for(int i = 0; i<5; i++)
        {
            a[0]=1;
            a[i]=1;
            for(int j = i-1; j>=1; j--)
                a[j] = a[j] + a[j-1];
            for(int k = 1; k<=gap; k++)
                System.out.print(" ");
            for(int l = 0; l<=i; l++)
               System.out.print(a[l] + " ");
            System.out.println();
            gap--;
        }
    }
}