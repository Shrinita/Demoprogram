
public class reverseString {

	public static void main(String[] args) 
	{
		String name="Sunita";
		System.out.println("Before reverse string is=="+name);
		StringBuffer sb=new StringBuffer(name);
		sb.reverse();
		System.out.println("Reverse string is=="+sb);

	}

}
