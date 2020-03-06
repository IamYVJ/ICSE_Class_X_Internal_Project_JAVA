import java.util.*;
class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    
    FruitJuice()
    {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Product Code: ");
        product_code = sc.nextInt();
        System.out.print("Enter Flavour: ");
        flavour = sc.nextLine();
        System.out.print("Enter Pack Type: ");
        pack_type = sc.nextLine();
        System.out.print("Enter Pack Size: ");
        pack_size = sc.nextInt();
        System.out.print("Enter Product Price: ");
        product_price = sc.nextInt();
    }
    
    void discount()
    {
        product_price = product_price - 10;
    }
    
    void display()
    {
        System.out.print("Enter Product Code: " + product_code);
        System.out.print("Enter Flavour: " + flavour);
        System.out.print("Enter Pack Type: " + pack_type);
        System.out.print("Enter Pack Size: " + pack_size);
        System.out.print("Enter Product Price: " + product_price);
    }
}