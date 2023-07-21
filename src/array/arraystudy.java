package array;

public class arraystudy {

	public static void main(String[] args) 
	{
		String ar[]=new String[4];
		ar[0]="A";
		ar[1]="b";
	    ar[2]="c";
	    ar[3]="d";
	    System.out.println(ar[3]);
	    
//	    String[] p=new String[4];
	    String p[][]= {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
	    
	    for(int i=0;i<=2;i++) 
	    {
	    	for(int j=0;j<=2;j++) {
	    	System.out.print(p[i][j]+" ");}
	    	System.out.println();
	    }
	    		
	}

}
