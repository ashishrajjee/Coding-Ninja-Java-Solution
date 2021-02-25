package for_loop;
import java.util.Scanner;
public class AllPrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 2; i <= n; i++)
		{
			boolean isPrimeNumber = true;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					isPrimeNumber = false;
					break;
				}
			}
			if(isPrimeNumber)
			{
				System.out.println(i);
			}
		}
	}
}
