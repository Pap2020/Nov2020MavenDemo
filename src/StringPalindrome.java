import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String outputstring = palindrome("MalayalaM");
		
	}
	
	
	public static String palindrome(String inputstring)
	{
		char[] arr = inputstring.toCharArray();
		String reverse = "";
		for(int i=inputstring.length()-1;i>=0;i--)
		{
			reverse = reverse + arr[i];
		}
		if(inputstring.equals(reverse))
		{
			System.out.println("its a palindrome");
			}
		else
		{System.out.println("not palindrome");}
		return reverse;
	}
		
	}