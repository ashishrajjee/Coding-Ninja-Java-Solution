package for_loop;
import java.util.Scanner;
public class NthFibonacciNumber
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nthfibonacci = 0, f1 = 1, f2 = 0;
		for(int i = 1; i <= n; i++)
		{
			f2 = nthfibonacci + f1;
			nthfibonacci = f1;
			f1 = f2;
		}
		System.out.println(nthfibonacci);
	}
}