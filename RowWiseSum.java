package stringsAnd2DArrays;
import java.util.Scanner;
public class RowWiseSum
{
	public static void rowWiseSum(int[][] mat)
    {
        int sum;
        for(int i = 0; i < mat.length; i++)
        {
            sum = 0;
            for(int j = 0; j < mat[0].length; j++)
            {
                sum = mat[i][j] + sum;
            }
            System.out.print(sum + " ");
        }
	}
	public static int[][] matrix(int x, int y)
	{
		Scanner s = new Scanner(System.in);
		int mat[][] = new int [x][y];
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				mat[i][j] = s.nextInt();
			}
		}
		return mat;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t > 0)
		{
			int rows = s.nextInt();
			int columns = s.nextInt();
			int mat[][] = matrix(rows, columns);
			rowWiseSum(mat);
			System.out.println();
			t--;
		}
	}
}
