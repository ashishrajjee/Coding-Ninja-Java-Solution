package stringsAnd2DArrays;

public class ReverseStringWordWise2
{
	public static String reverseWordWise(String input)
	{
		input = input + ' ';
		String revStr = "";
		int beginIndex = 0;
		for(int i =0; i < input.length(); i++)
		{
			String revWord = "";
			if(input.charAt(i) == ' ')
			{
				for(int j = beginIndex; j < i; j++)
				{
					revWord += input.charAt(j);
				}
				if(revStr == "")
					revStr = revWord + revStr;
				else
					revStr = revWord + " " + revStr;
				beginIndex = i + 1;
			}
		}
		return revStr;
	}
	public static void main(String[] args)
	{
		String s = "Ashish Raj Kushwaha";
		String str = reverseWordWise(s);
		System.out.print(str);
	}
}
