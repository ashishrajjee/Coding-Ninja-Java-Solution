package array;
public class FindDuplicate
{
	public static int duplicateNumber(int arr[])
	{
    	int size=arr.length;
        int i;
        for(i=0;i<size;i++)
        {
            for(int j = i + 1; j<size; j++)
            {
                if( arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
