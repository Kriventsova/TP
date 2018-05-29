
public class Palindrome 
{
	public static void main(String[] args)
	{
		
        	for (int i = 0; i < args.length; i++) 
		{	if (args[i].equals(reverseString(args[i])))
			{
				System.out.println("'"+args[i]+"'pal");
			}
			else
			{
				System.out.println("'"+args[i]+"' not a pal");
			}
		}
	}
	public static String reverseString(String s)
	{
        	String a = "";
		for (int i = s.length(); i>0; i--)
		{
			a+= s.charAt(i-1);
		}
		return a;
    	}
}

