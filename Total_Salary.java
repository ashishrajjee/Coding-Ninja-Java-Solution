package assignment;
import java.util.Scanner;
public class Total_Salary
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char ch	= s.next().charAt(0);
		float hra = 20/100f;
		float da = 50/100f;
		float pf = 11/100f;
		if(ch == 'A')
		{
			System.out.println((Math.round(n + (hra * n) + (da * n) + 1700 - (pf * n))));
		}
		else if ( ch == 'B')
		{
			System.out.println((Math.round(n + (hra * n) + (da * n) + 1500 - (pf * n))));
		}
		else
		{
			System.out.println((Math.round(n + (hra * n) + (da * n) + 1300 - (pf * n))));
		}
	}
}
