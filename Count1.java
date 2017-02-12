package Jayanthan;

import java.util.Scanner;

public class Count1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i=1,j=1,n;
		System.out.println("Enter a number between 1 to 10");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=1;j++)
			{
				if(i!=n)
			{
			System.out.println(i);
			System.out.println(j);
			}
			}
		}
	}

}
