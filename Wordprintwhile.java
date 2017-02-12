package Jayanthan;

import java.util.Scanner;

public class Wordprintwhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the word to print");
String a=s.next();
System.out.println("Enter the no. of times the word should be printed");
n=s.nextInt();
while(i<=n){
	System.out.println(a);
	i=i+1;
}
	}

}
