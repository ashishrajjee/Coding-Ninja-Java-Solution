package stringsAnd2DArrays;
import java.util.Scanner;
public class LargestColumnSum
{
	public static int[][] takeinput()
	{
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int columns = s.nextInt();
		int input[][] = new int[rows][columns];
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	public static void print(int input[][])
	{
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input[0].length; j++)
			{
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int largestColumnSum(int input[][])
	{
		int largest = Integer.MIN_VALUE;
		for(int j = 0; j < input[0].length; j++)
		{
			int sum = 0;
			for(int i = 0; i < input.length; i++)
			{
				sum = sum + input[i][j];
			}
			if(sum > largest)
			{
				largest = sum;
			}
		}
		return largest;
	}
	public static void main(String[] args)
	{
		int input[][] = takeinput();
		print(input);
		System.out.println(largestColumnSum(input));
	}
}