package stringsAnd2DArrays;
public class ReverseStringWordWise3
{
	public static String reverseWordWise(String input)
	{
		input = input + ' ';
		String revStr = "";
		int beginIndex = 0;
		for(int i =0; i < input.length(); i++)
		{
			if(input.charAt(i) == ' ')
			{
				if(revStr == "")
					revStr = input.substring(beginIndex, i) + revStr;
				else
					revStr = input.substring(beginIndex, i) + " " + revStr;
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
