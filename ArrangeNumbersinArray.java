package array;
public class ArrangeNumbersinArray
{
    public static void arrange(int[] arr, int n)
	{
		int odd = 1, i = 0;
		while(odd <= n)
		{
			arr[i] = odd;
			odd += 2;
			i++;
		}
		int even = 0;
		if(n % 2 == 0)
		{
			even = n;
		}
		else
		{
			even = n - 1;
		}
		while(even >= 2)
		{
			arr[i] = even;
			even -= 2;
			i++;
		}
	}
}