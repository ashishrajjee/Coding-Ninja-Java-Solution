package searching_and_sorting;
public class CodeBinarySearch
{
	public static int binarySearch(int[] arr, int x)
	{
		int start = 0, stop = arr.length - 1; 
        while (start <= stop)
        { 
            int mid = start + (stop - start) / 2;
            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;
            // If x greater, ignore left half 
            if (arr[mid] < x) 
                start = mid + 1;
            // If x is smaller, ignore right half 
            else
                stop = mid - 1; 
        } 
        // if we reach here, then element was 
        // not present 
        return -1; 
    }
	public static void main(String[] args)
	{
		int[] input = {2,4,5,8,9,15,21,28};
		int index = binarySearch(input, 5);
		System.out.println(index);
	}
	//public static void main(String args[]) 
    //{ 
      //  int arr[] = { 2, 3, 4, 10, 40 }; 
        //int x = 10; 
       // int result = binarySearch(arr, x); 
       // if (result == -1) 
         //   System.out.println("Element not present"); 
       // else
         //   System.out.println("Element found at "
           //                    + "index " + result); 
    //}
}