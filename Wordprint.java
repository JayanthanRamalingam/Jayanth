package Jayanthan;

import java.util.Scanner;

public class Wordprint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word to print");
		String a=s.next();
		System.out.println("Enter the no. of times the word to print");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(a);
		}
	}

}
