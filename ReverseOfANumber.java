package assignment;
import java.util.Scanner;
public class ReverseOfANumber
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reversed = 0;
		while(n != 0 )
		{
			int reminder = 0;
			reminder = n % 10;
			reversed = (reversed * 10) + reminder;
			n = n / 10;
		}
		System.out.println(reversed);
	}
}
