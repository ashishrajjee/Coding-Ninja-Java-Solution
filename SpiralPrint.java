package stringsAnd2DArrays;
import java.util.Scanner;
public class SpiralPrint
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
	public static void spiralPrint(int input[][])
	{
		int i, startRow = 0, startColumn = 0;
		if(input.length == 0)
            return;
		int lastRow = input.length - 1;
		int lastColumn = input[0].length - 1;
		while(startRow <= lastRow && startColumn <= lastColumn)
		{
			for(i = startColumn; i <= lastColumn; i++)
				System.out.print(input[startRow][i] + " ");
			startRow++;
			for(i = startRow; i <= lastRow; i++)
				System.out.print(input[i][lastColumn] + " ");
			lastColumn--;
			if(startRow <= lastRow)
			{
				for(i = lastColumn; i >= startColumn; i--)
					System.out.print(input[lastRow][i] + " ");
				lastRow--;
			}
			if(startColumn <= lastColumn)
			{
				for(i = lastRow; i >= startRow; i--)
					System.out.print(input[i][startColumn] + " ");
				startColumn++;
			}
		}
	}
	public static void main(String[] args)
	{
		int input[][] = takeinput();
		print(input);
		spiralPrint(input);
	}
}