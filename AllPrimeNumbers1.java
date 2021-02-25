package for_loop;
import java.util.Scanner;
public class AllPrimeNumbers1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 2; i <= n; i++)
		{
			int j = 0;
			for(j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					break;
				}
			}
			if(i == j)
			{
				System.out.println(i);
			}
		}
	}
}
