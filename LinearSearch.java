package array;
public class LinearSearch
{
	public static int linearSearch(int arr[], int x)
	{
		int size=arr.length;
        int i;
        for(i=0;i<size;i++)
        {
            if( x == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
