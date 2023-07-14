package revisionPattrrn2;

public class Reve {

	public static void main(String[] args) 
	{
		String name="MOM";
		
		String A="";
		
	for(int i=name.length()-1;i>=0;i--) 
	{
		A=A+name.charAt(i);
	}
	System.out.println(A);
	
	if(name.equals(A)) 
	{
		System.out.println("polindrome");
	}
		}

}
