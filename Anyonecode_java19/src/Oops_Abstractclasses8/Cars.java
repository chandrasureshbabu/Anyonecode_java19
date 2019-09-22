package Oops_Abstractclasses8;

public abstract class  Cars {
// abstract class can non abstract method as abstract methods
	
	
	
	public String make;
	
	
	
	public void carMake(String make)
	{
		this.make=make;
		System.out.println("Car make is :"+make);
		
	}
	
	public abstract void engine(String engineType, int NoofCylinders);
}
