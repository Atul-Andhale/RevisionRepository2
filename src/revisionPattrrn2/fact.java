package revisionPattrrn2;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=5;i>=1;i--) 
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
