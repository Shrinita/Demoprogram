
public class DuplicateCharacter {

	public static void main(String[] args) 
	{
		String str="suniita";
		int cnt=0;
		char[] ch=str.toCharArray();
		System.out.print("Duplicate characters are==");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
			if(ch[i]==ch[j])
			{
				System.out.println(ch[j]);
				cnt++;
				break;
			}
		}
		}

	}

}
