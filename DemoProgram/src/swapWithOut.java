import java.util.Scanner;


public class swapWithOut {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping number is=="+a+"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping number is=="+a+" "+b);
	}

}
