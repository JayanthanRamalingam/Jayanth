package Jayanthan;

import java.util.Scanner;

public class Great {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the three numbers a, b and c");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println("a is the greatest");
			}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is the greatest");
		}
		else
		{
			System.out.println("c is the greatest");
		}
	}

}
