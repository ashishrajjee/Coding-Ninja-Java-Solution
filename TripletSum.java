package array;
public class TripletSum
{
	public static int findTriplet(int[] arr, int x)
	{
		int c = 0;
    	for(int i=0;i<arr.length;i++)
        {
            for(int j = i + 1; j<arr.length; j++)
            {
                for(int k = j + 1; k < arr.length; k++)
                {
                    if( x == arr[i] + arr[j] + arr[k])
                {
                    c++;
                }
                }
            }
        }
        return c;
    }

}