package assignment;
public class RemoveCharacterInString
{
	public static String removeAllOccurrencesOfChar(String input, char c)
	{
		String str = "";
		str = str + c;
		input = input.replaceAll(str, "");
		return input;
		
	}
	public static void main(String[] args)
	{
		String s = "ashish raj kushwaha";
		char c = 'a';
		String str = removeAllOccurrencesOfChar(s, c);
		System.out.print(str);
	}
}
