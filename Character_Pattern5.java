package patterns;
import java.util.Scanner;
public class Character_Pattern5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while( i <= n )
		{
			int j = 1;
			char starting = 'A';
			while( j <= i)
			{
				System.out.print((char)(starting+n-i));
				starting++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
