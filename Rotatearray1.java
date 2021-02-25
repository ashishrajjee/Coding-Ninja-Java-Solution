package assignment;
public class Rotatearray1
{
	public static void rotate(int[] arr, int d)
	{
		int arr1[] = new int[arr.length];
		for(int i = 0; i < d; i++)
		{
			arr1[i] = arr[i];
		}
		int j = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(i + d < arr.length)
			{
				arr[i] = arr[i + d];
			}
			else
			{
				arr[i] = arr1[j];
				j++;
			}	
		}
    }
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int d = 3;
		rotate(arr, d);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
