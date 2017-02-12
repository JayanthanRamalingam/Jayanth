package Jayanthan;

import java.util.Scanner;

public class Evenorodd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
if((n%2)==0)
{
	System.out.print("\nThe given number\t" +n);
	System.out.print("\tis even");
}
else
{
	System.out.print("\nThe given number\t" +n);
	System.out.print("\tis odd");
}
	}

}