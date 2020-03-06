import java.util.*;
class movieMagic
{
    int year;
    String title;
    float rating;
    
    movieMagic()
    {
        year = 0;
        title = "";
        rating = 0.0f;
    }
    
    void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Rating: ");
        rating = sc.nextFloat();
    }
    
    void display()
    {
        if(rating<0 || rating>5)
        System.out.print("Invalid Rating");
        else if(rating<=2)
        System.out.print("Flop");
        else if(rating<=3.4)
        System.out.print("Semi-Hit");
        else if(rating<=4.5)
        System.out.print("Hit");
        else
        System.out.print("Superhit");
    }
    
    void main()
    {
        movieMagic mm = new movieMagic();
        mm.accept();
        mm.display();
    }
}