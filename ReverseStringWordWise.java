package stringsAnd2DArrays;
public class ReverseStringWordWise
{
	public static String reverseWordWise(String input)
	{
		String s[] = input.split(" ");
        String temp = "";
        String ans= "";
        for (int i = s.length - 1; i >= 0; i--) 
        {
        	if(temp == "")
        		temp += s[i];
        	else
        		temp += " " + s[i];
        }
        ans+=temp.substring(0,temp.length() - 1);
        return ans;
	}
	public static void main(String[] args)
	{
		String s = " I am Ashish Raj Kushwaha";
		String str = reverseWordWise(s);
		System.out.print(str);
	}
}
