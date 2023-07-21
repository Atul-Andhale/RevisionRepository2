package StringMethods;

public class smethods {

	public static void main(String[] args) 
	{
//		String s="Velocity";
//		String s2="velocity";
//		int s1 = s.length();
//		System.out.println(s1);
//		
//		String m = s.toUpperCase();
//		System.out.println(m);
//		
//		String m3 = s.substring(2, 5);
//		System.out.println(m3);
//		String j="India is my country";
//		
//		String b = j.replace(" ", "-");
//		System.out.println(b);
		
		String p="India is my country";
		String[] ar = p.split(" ");
		for(int i=0;i<=ar.length;i++) 
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
