package interfacestudy;

public interface father 
{ 
	void bike();
	void car();
	default void money()
	{
	 System.out.println("Father money");
	}

}
