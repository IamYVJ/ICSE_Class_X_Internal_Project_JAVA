/**
 *  Design a class to overload a function polygon() as follows:
 *  (i)   void polygon(int n, char ch) - draws a filled square of side n using the character stored in ch
 *  (ii)  void polygon(int x, int y) - draws a filled rectangle of length x and breadth y using the symbol '@'
 *  (iii) void polygon() - draws a filled triangle
 *  
 *  Example:
 *  (i) Input: n = 2
 *             ch = 'O'
 *      Output: OO
 *              OO
 *  (ii)Input: x = 2
 *              y = 5
 *      Output: @@@@@
 *              @@@@@
 *  (iii)Output: *
 *               **
 *               ***
 *      
 * ICSE 2012 
 */
class Overload
{
    void polygon(int n, char ch)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
                System.out.print(ch);
            System.out.println();
        }
    }

    void polygon(int x, int y)
    {
        for(int i = 1; i<=x; i++)
        {
            for(int j = 1; j<=y; j++)
                System.out.print('@');
            System.out.println();
        }
    }

    void polygon()
    {
        for(int i =1; i<=3; i++)
        {
            for(int j =1; j<=i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}