/**
 *  Given below is a hypothetical table showing rates of Income Tax for male citizens below or equal to the age of 65 years:
 *   
 *   | ---------------------------------------------------------------- |
 *   |    TAXABLE INCOME (TI) in Rs.   |         INCOME TAX in Rs.      |
 *   | ---------------------------------------------------------------- |
 *   |         TI <= 1,60,000          |               Nil              |
 *   |    1,60,000 < TI <= 5,00,000    |        (TI-1,60,000)*10%       |
 *   |    5,00,000 < TI <= 8,00,000    |  [(TI-5,00,000)*20%] + 34,000  |
 *   |          TI > 8,00,000          |  [(TI-8,00,000)*30%] + 94,000  |
 *   | ---------------------------------------------------------------- |
 *   
 *   Write a program to input the age, gender(male or female) and taxable income of a person.
 *   If the age is more than 65 years or the gender is female, display
 *   "Wrong Category".
 *   If the age is less than or equal to 65 years and the gender is male, compute and display
 *   the Income Tax payable as per the table given above.
 *   
 *   ICSE 2012
 */
import java.util.*;
class IncomeTax
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Gender: ");
        String gen = sc.next();
        System.out.print("Enter Taxable Income: ");
        double inc = sc.nextDouble();
        if(age > 65 || gen.equalsIgnoreCase("female"))
            System.out.println("Wrong Category");
        else if(gen.equalsIgnoreCase("male"))
        {
            double tax;
            if(inc <= 160000)
                tax = 0.0;
            else if(inc <= 500000)
            {
                tax = (inc-160000)*0.1;
            }
            else if(inc<=800000)
            {
                tax = ((inc-500000)*0.2) + 34000;
            }
            else 
                tax = ((inc-800000)*0.3) + 94000;
            System.out.println("Income Tax: Rs." + tax);
        }
    }
}