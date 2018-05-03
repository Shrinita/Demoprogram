import java.util.Scanner;


public class swapWith {

	public static void main(String[] args)
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before values are=="+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the numbers are=="+a+"  "+b);
		

	}

}
