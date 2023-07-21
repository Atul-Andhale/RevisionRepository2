package inheritance;

public class Single {

	public static void main(String[] args) 
	{
		mother m=new mother();
		m.care();
		mother.nature();
		
		son s=new son();
		s.care();
		son.laptopo();
		son.nature();

	}

}
