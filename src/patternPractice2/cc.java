package patternPractice2;

public class cc {

	public static void main(String[] args)
	{

//  row=7
		int star=4;
		
		for(int i=1;i<=7;i++) 
		{
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
//			star++;
			System.out.println();
			
			if(i<4) 
			{
				star--;
			}
			else 
			
			{
				star++;
			}
		}

	}

}
