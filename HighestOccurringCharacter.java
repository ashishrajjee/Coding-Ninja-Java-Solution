package assignment;
public class HighestOccurringCharacter
{
	public static char highestOccuringCharacter(String inputString)
	{
		char c = ' ';
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < inputString.length(); i++)
		{
			int count = 1;
			for(int j = i + 1 ; j < inputString.length(); j++)
			{
				if(inputString.charAt(i) == inputString.charAt(j))
				{
					count++;
				}
			}
			if(count > max)
			{
				max = count;
				c = inputString.charAt(i);
			}
		}
		return c;
		
	}
	public static void main(String[] args)
	{
		String s = "ashishrajkushwaha";
		char c = highestOccuringCharacter(s);
		System.out.print(c);
	}
}
