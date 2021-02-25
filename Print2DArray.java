package test2;
public class Print2DArray
{
	public static void print2DArray(int input[][])
	{
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input.length - i; j++)
			{
				for(int k = 0; k < input[i].length; k++)
				{
					System.out.print(input[i][k] + " ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args)
	{
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		print2DArray(arr);
	}
}
