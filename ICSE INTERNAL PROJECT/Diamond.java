import java.util.*;
class Diamond
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter odd number of rows: ");
        int n = sc.nextInt();
        if(n%2==0)
            n/=2;
        else
           n = (n+1)/2;
        System.out.println("\n");
        for (int i = 1; i <= n; i++)
        {

            for (int j = 0; j < (n - i); j++)

                System.out.print(" ");

            for (int j = 1; j <= i; j++)

                System.out.print("*");

            for (int k = 1; k < i; k++)

                System.out.print("*");

            System.out.println();

        }

        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();

    }

}