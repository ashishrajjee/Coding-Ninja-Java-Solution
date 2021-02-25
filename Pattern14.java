package patterns;
import java.util.Scanner;
public class Pattern14
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while( i <= n )
		{
			int j = 0;
			while( j < i)
			{
				System.out.print(i+j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
