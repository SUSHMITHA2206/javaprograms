package lcmoftwonumbers;

import java.util.Scanner;

public class LcmExample {

	public static void main(String[] args) {
		int num1=0,num2=0,gcd=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		num1=s.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num2=sc.nextInt();		
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if(num1%i==0&&num2%i==0)
				gcd=i;
		}
		int lcm=(num1*num2)/gcd;
		System.out.print("the lcm"+lcm);

	}

}
