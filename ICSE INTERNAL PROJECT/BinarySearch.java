/**
 * Program to perform binary search on a list of integers given below, to search for an element input
 * by the user, if it is found display the element along with its position, otherwise display the message
 * "Search element not found"
 * 5,7,9,11,15,20,30,45,89,97
 * 
 * ICSE 2010
 */
class BinarySearch
{
    void main(int n)
    {
        int arr[] = {5,7,9,11,15,20,30,45,89,97};
        int low = 0;
        int high = arr.length-1;
        boolean flag = false;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==n)
            {
                flag=true;
                System.out.println("Search element found at position " + mid);
                break;
            }
            else if(arr[mid]<n)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        if(flag==false)
        {
            System.out.println("Search element not found");
        }
    }
}

        