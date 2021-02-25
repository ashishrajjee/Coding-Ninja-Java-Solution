package assignment;
import java.util.Scanner;
public class BinaryToDecimal
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		int rem = 0, decimal = 0, i = 1;
		while(binary != 0)
		{
			rem = binary % 10;
			decimal = decimal + (rem * i);
			i = i * 2;
			binary = binary / 10;
		}
		System.out.print(decimal);
	}
}