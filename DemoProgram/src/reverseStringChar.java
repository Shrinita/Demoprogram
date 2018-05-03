
public class reverseStringChar {

	public static void main(String[] args)
	{
		String name="sagar";
		System.out.println(name.length());
		char ch[]=name.toCharArray();
		System.out.println(ch.length);
		//String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		

	}

}
