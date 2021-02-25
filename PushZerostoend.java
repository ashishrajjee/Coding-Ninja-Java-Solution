package assignment;
public class PushZerostoend
{
	public static void pushZerosAtEnd(int[] arr)
    {
        int k = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
            	int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
    }
	public static void main(String[] args)
	{
		int arr[] = {5,0,6,7,0,0,9,1,0};
		pushZerosAtEnd(arr);
		for(int i = 0; i < arr.length; i++)
        {
        	System.out.print(arr[i] + " ");
        }
	}
}
