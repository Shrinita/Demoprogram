import java.util.Scanner;


public class palindromeString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+""+s.charAt(i);
		}
		if(s.equals(s1))
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}

}
