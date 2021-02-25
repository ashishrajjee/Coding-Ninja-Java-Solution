package test;
import java.util.Scanner;
public class CheckArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int temp, n, c= 0,rem,a,multi = 1, sum = 0,input;
		temp = number;
		n = number;
		input = number;
		while(temp != 0)
		{
			temp = temp /10;
			c++;
		}
		while(n != 0)
		{
			rem = n % 10;
			multi = 1;
			for(int i = 1; i <= c; i++)
			{
				multi = multi * rem;
			}
			sum = sum + multi;
			n = n /10;
		}
		if(input == sum)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}