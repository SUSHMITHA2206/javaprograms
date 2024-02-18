package gcdofnum;

import java.util.Scanner;

public class GcdExample {
	public static void main(String[] args) {
		int n1=0,n2=0,gcd;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n1=s.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n2=sc.nextInt();
		while(n1!=n2) {
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
			}
		System.out.println("the gcd is:"+n1);
	}
	
	

}
