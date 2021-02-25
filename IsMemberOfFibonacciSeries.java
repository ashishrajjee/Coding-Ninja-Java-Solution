package functions;
import java.util.Scanner;
public class IsMemberOfFibonacciSeries
{
	public static boolean checkMember(int n)
	{
		int nthfibonacci = 0, f1 = 1, f2 = 0;
		for(int i = 0; i <= n; i++)
		{
			if(n == f2)
				return true;
			f2 = nthfibonacci + f1;
			nthfibonacci = f1;
			f1 = f2;
		}
		return false;
	}
	public static void main(String[] args)
	{
		try (Scanner s = new Scanner(System.in))
		{
			int n = s.nextInt();
			boolean a = checkMember(n);
			System.out.println(a);
		}
	}
}