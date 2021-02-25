package assignment;
import java.util.Scanner;
public class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i*i <= n)
		{
			i++;
		}
		if(i*i == n)
			System.out.println(i);
		else
			System.out.println(i-1);
	}

}
