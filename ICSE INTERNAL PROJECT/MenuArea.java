/**
 * Menu based program to either find the area of a square or a rectangle or a circle depending on the the user's choice
 */
import java.util.*;
class MenuArea
{
    void main()
    {
        Scanner sc =new Scanner (System.in);
        int ch;
        double s,b,a;
        System.out.println("Find The Area Of: ");
        System.out.println("1) Square" );
        System.out.println("2) Rectangle");
        System.out.println("3) Circle");
        System.out.println("Enter your choice: ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter Side: ");
                    s = sc.nextInt();
                    a=s*s;
                    System.out.println("Area: " + a);
                    break;
            case 2: System.out.println("Enter Length: ");
                    s=sc.nextInt();
                    System.out.println("Enter Breadth: ");
                    b=sc.nextInt();
                    a=s*b;
                    System.out.println("Area: " + a);
                    break;
            case 3: System.out.println("Enter Radius: ");
                    s=sc.nextInt();
                    a = Math.PI*s*s;
                    System.out.println("Area: " + a);
                    break;
             default: System.out.println("Wrong Choice");
            }
        }
    }