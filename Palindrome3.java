import java.util.*;
public class Palindrome3
{
	public static void main(String[] args) //palindrome
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		//String strlower=str.toLowerCase();
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		//String revlower=rev.toLowerCase();
		if(str.equals(rev))
			{
				
				System.out.println("its palindrome:");
			}
			else
			{
				
				System.out.println("its not palindrome:");
			}
	}
	}
