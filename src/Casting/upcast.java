package Casting;

public class upcast {

	public static void main(String[] args) 
	{
	
		father f= new father();
		f.bike();
		f.car();
		
		System.out.println("======");
		son s= new son();
		s.bike();
		s.car();
		System.out.println("======");
		father m=new son();
		m.bike();
		m.car();
	}

}
