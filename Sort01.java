package array;
public class Sort01
{
	public static void sortZeroesAndOne(int[] arr)
	{
		int count0=0;
		for(int i : arr)
		{
			if(i==0)
			{
				count0++;
			}
		}
		for(int i=0;i<count0;i++)
		{
			arr[i]=0;	
		}
		for(int i=count0;i<arr.length;i++)
		{
			arr[i]=1;
		}
	}	
}


// public class Solution {
//     public static void sortZeroesAndOne(int[] arr) {
//     	for(int i = 0; i < arr.length; i++)
//         {
//             for(int j = arr.length; i < j; j--)
//             {
//                 if( arr[i] == 0)
//                 {
//                     break;
//                 }
//                 else if(arr[j] == 0)
//                 {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                     break;
//                 }
//             }
//         }
//     }
// }