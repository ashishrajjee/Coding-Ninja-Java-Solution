package assignment;
public class CheckPermutation1
{
	public static boolean isPermutation(String input1, String input2)
	{
		int a = input1.length();
        int b = input2.length();
        if(a != b)
        {
        	return false;
        }
        int check[] = new int[255];
        for(int i = 0; i < a; i++)
    	{
    		int temp = (int)input1.charAt(i);
    		check[temp]++;
    	}
    	for(int i = 0; i < b; i++)
    	{
    		int temp = (int)input2.charAt(i);
    		if(check[temp] != 0)
    		{
    			check[temp]--;
    		}
    		else
    		{
    			return false;
    		}
    	}
        return true;
	}
	public static void main(String[] args)
	{
		String input1 = "abba";
		String input2 = "baab";
		boolean b = isPermutation(input1, input2);
		input1 = "aab";
		input2 = "bba";
		boolean b1 = isPermutation(input1, input2);
		System.out.println(b);
		System.out.print(b1);
	}
}
