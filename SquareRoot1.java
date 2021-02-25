package assignment;
import java.util.Scanner;
public class SquareRoot1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0,ans=0;
		while(ans <= n)
		{
			i++;
			ans = i*i;
		}
		System.out.println(i - 1 );
	}

}
