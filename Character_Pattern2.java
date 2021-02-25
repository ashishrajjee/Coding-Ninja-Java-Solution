package patterns;
import java.util.Scanner;
public class Character_Pattern2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while( i <= n )
		{
			int j = 1;
			char starting = (char)('A' + i - 1);
			while( j <= n)
			{
				System.out.print(starting);
				starting++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
