package patternPractice2;

public class descpyramid {

	public static void main(String[] args) 
	{
//		row=5
		int star=7;
		int space=0;
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			space++;
			star=star-2;
			System.out.println();
		}

	}
	}


