package stringsAnd2DArrays;
public class PrintAllSubstrings
{
	public static void printSubstrings(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i; j < str.length(); j++)
			{
				System.out.println(str.substring(i, j+1));
			}
			
		}
	}
	public static void main(String[] args)
	{
		String s = "xyz";
		printSubstrings(s);
		
	}
}
