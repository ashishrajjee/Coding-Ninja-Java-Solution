package assignment;
import java.util.Scanner;
public class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int decimal = s.nextInt();
		long rem = 0, binary = 0, i = 1;
		while(decimal != 0)
		{
			rem = decimal % 2;
			binary = binary + (rem * i);
			i = i * 10;
			decimal = decimal / 2;
		}
		System.out.print(binary);
	}
}