package patterns;
import java.util.Scanner;
public class Pattern5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int val = 1;
		while( i <= n )
		{
			int space = 1;
			while( space <= n - i)
			{
				System.out.print(" ");
				space = space + 1;
			}
			val = i;
			int j = 1;
			while( j <= i )
			{
				System.out.print(val);
				val = val + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
