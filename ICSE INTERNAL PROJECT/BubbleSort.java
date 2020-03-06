/**
 * Program to sort an integer array of 20 elements in descending order using Bubble Sort technique
 */
import java.util.*;
class BubbleSort
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [20];
        for(int i = 0; i<19; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i<19; i++)
        {
            for(int j = 0; j<19-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for(int i = 0; i<20; i++)
            System.out.println(arr[i]);
    }
}