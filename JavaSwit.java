package Jayanthan;

import java.util.Scanner;

public class JavaSwit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
System.out.println("1.JAVA");
System.out.println("2.ANDROID");
System.out.println("3.DOTNET");
Scanner s=new Scanner(System.in);
System.out.println("Enter the choice");
n=s.nextInt();
switch (n)
{
	case 1 : System.out.println("Java");
	break;
	case 2 : System.out.println("Android");
	break;
	case 3 : System.out.println("Dotnet");
	break;
	
}
	}

}
