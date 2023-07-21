package interfacestudy;

public class son implements mother,father{

	@Override
	public void bike() {
		
		System.out.println("father bike");
	}

	@Override
	public void car() {
	System.out.println("father car");
		
	}
	public void study() 
	{
		System.out.println("study");
	}

	@Override
	public void money() {
		
		father.super.money();
		mother.super.money();
	}

	@Override
	public void scooty() {
		System.out.println("mother scooty");
		
	}

	@Override
	public void food() {
		System.out.println("food");
		
	}

}
