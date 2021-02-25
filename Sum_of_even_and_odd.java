package assignment;
import java.util.Scanner;
public class Sum_of_even_and_odd
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int evensum = 0;
		int oddsum = 0;
		int a = 0;
		while( n != 0 )
		{
			a = n % 10;
			if( a % 2 == 0)
			{
				evensum = evensum + a;
			}
			else
			{
				oddsum = oddsum + a;
			}
			n = n / 10;
		}
		System.out.println(evensum + " " + oddsum);
	}

}
