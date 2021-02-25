package array;
public class PairSum
{  

    public static int pairSum(int arr[], int x) {
        int c = 0;
    	for(int i=0;i<arr.length;i++)
        {
            for(int j = i + 1; j<arr.length; j++)
            {
                if( x == arr[i] + arr[j])
                {
                    c++;
                }
            }
        }
        return c;
    }
}