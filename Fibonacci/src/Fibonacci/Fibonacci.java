package Fibonacci;
import java.util.Scanner;
public class Fibonacci {

	

	public static void main(String[] args) {
	 int n,f=0,f1=0,f2=1;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the n value=");
	  n =s.nextInt();
		 for(int i=1;i<=n;i++) {
			 f=f1;
			 f1=f2;
			 f2=f+f1;
			 System.out.println(f+" ");
		 }
		
	 }
     
	}


