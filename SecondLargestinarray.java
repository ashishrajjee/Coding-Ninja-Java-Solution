package assignment;
public class SecondLargestinarray
{
	public static int secondLargestElement(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				secondlargest = largest;
				largest = arr[i];
			}
		}
		return secondlargest;
    }
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,9,15,7,5,6};
		int arr1[] = {5,5,5,5,5};
		int a = secondLargestElement(arr);
		int b = secondLargestElement(arr1);
		System.out.println(a);
		System.out.println(b);
		
	}
}