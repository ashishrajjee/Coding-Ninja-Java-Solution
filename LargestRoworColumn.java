package stringsAnd2DArrays;
import java.util.Scanner;
public class LargestRoworColumn
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
	public static void largestColumnSum(int input[][])
	{
		boolean isRow = true;
		int largestSum = Integer.MIN_VALUE;
		int nRows = input.length;
		if(nRows == 0)
		{
			System.out.println("row " + nRows + " " + largestSum);
			return;
		}
		int index = 0;
		int mCols = input[0].length;
		for(int i = 0; i < nRows; i++)
		{
			int rowSum = 0;
			for(int j = 0; j < mCols; j++)
			{
				rowSum += input[i][j];
			}
			if(rowSum > largestSum)
			{
				largestSum = rowSum;
				index = i;
			}
		}
		for(int j = 0; j < mCols; j++)
		{
			int colSum = 0;
			for(int i = 0; i < nRows; i++)
			{
				colSum += input[i][j];
			}
			if(colSum > largestSum) {
				largestSum = colSum;
				index = j;
				isRow = false;
			}
		}
		if(isRow)
		{
            System.out.println("row " + index + " " + largestSum);
		}
		else
		{
			System.out.println("column " + index + " " + largestSum);
		}
	}
	public static void main(String[] args)
	{
		int input[][] = takeinput();
		print(input);
		largestColumnSum(input);
	}
}