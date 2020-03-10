package primenumber;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the range for prime numbers ");
		int n=scr.nextInt();
		
		
		for(int i=2;i<n;i++)
		
		{
		for(int j=2;j<i;j++)
		{
		
		if (i%j==0)
			f=1;
		break;
		
		
	}

		if (f==0)
			System.out.println (i);
		}
		
		
		//else
			//System.out.println("The given number is not prime");
		
}
}