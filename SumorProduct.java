package assignment;
import java.util.Scanner;
public class SumorProduct
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int b = s.nextInt();
		if(b == 1)
		{
			int sum = 0;
			for(int i = 1; i <= n; i++)
			{
				sum = sum + i;
			}
			System.out.print(sum);
		}
		else if( b == 2)
		{
			int sum = 1;
			for(int i = 1; i <= n; i++)
			{
				sum = sum * i;
			}
			System.out.print(sum);
		}
		else
		{
			System.out.print("-1");
		}
	}
}
