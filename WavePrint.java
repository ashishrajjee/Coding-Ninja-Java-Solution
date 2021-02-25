package stringsAnd2DArrays;
import java.util.Scanner;
public class WavePrint
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
	public static void wavePrint(int input[][])
	{
		int nRows = input.length;
		if(nRows == 0)
			return;
		int nColumns = input[0].length;
		for(int i = 0; i < nColumns; i++)
		{
			if(i % 2 == 0)
			{
				for(int j = 0; j < nRows; j++)
				{
					System.out.print(input[j][i] + " ");
				}
			}
			else
			{
				for(int j = nRows - 1; j >= 0; j--)
				{
					System.out.print(input[j][i] + " ");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int input[][] = takeinput();
		print(input);
		wavePrint(input);
	}
}