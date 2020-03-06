/**
* Define a class called Library with the following description:
  Instance variables/data members:
  int acc_num-stores the accession number of the book
  String title-stores the title of the book
  String author-stores the name of the author
* Member methods:
  (i)void input () To input and store the accession number,title and author.
  (ii)void computer() To accept the number of days late,calculate and display the fine charged at the rate of Rs 2 per day. 
  (iii)void display() To display the details in the following format:
        Accession Number Title Author 
* Write a main method to create an object of the class and call the above member methods.
* 
* ICSE 2012
*/
import java.io.*;
class Library
{
    int acc_num;
    String title;
    String author;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        System.out.print("Enter accession no: "); 
        acc_num = Integer. parseInt(br.readLine());
        System.out.print("Enter title: "); 
        title = br.readLine();
        System.out.print("Enter author: "); 
        author = br.readLine();
    }

    void compute()throws IOException
    {
        System.out.print("No of days late: ");
        int d = Integer.parseInt(br.readLine());
        System.out.println("Fine: Rs." + (d*2));
    }

    void display()
    {
        System.out.println(); 
        System.out.println("Accession Number" + "   " + "Title" + "\t" + "Author");
        System.out.println("\t" + acc_num + "\t  " + title + "\t" + author);
    }

    void main()throws IOException
    {
        Library obj = new Library();
        obj.input();
        obj.compute();
        obj.display();
    }
}