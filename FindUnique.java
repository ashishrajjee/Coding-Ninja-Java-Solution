package array;
public class FindUnique
{
	public static int findUnique(int[] arr)
	{
		int size=arr.length;
        int a;
        for(int i=0;i<size;i++)
        {
            a = 0;
            for(int j = 0; j<size; j++)
            {
                if( arr[i] == arr[j])
                {
                    a++;
                }
            }
            if( a == 1)
                return arr[i];
        }
        return -1;
    }
}