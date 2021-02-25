package assignment;
public class CheckPermutation
{
	public static boolean isPermutation(String input1, String input2)
	{
		if(input1.length() == input2.length())
		{
			for(int i = 0; i < input1.length(); i++)
			{
				for(int j = i + 1; j < input2.length(); j++)
				{
					if(input1.charAt(i) == input2.charAt(j))
		        	{
		        		return true; 
		        	}
				}	
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		String input1 = "abcde";
		String input2 = "baedc";
		boolean b = isPermutation(input1, input2);
		input1 = "abab";
		input2 = "baba";
		boolean b1 = isPermutation(input1, input2);
		System.out.println(b);
		System.out.print(b1);
	}
}
