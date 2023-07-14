package revisionPattrrn2;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter number");
		int num=sc.nextInt();
		
		int b=0;
		for(int i=2;i<=num;i++)
		{
			if(num%2==0) 
			{
				b++;
				break;
			}
			
		}
		if(b==1) 
		{
			System.out.println("not prime");
		}
		else {System.out.println("prime");}

	}

}
