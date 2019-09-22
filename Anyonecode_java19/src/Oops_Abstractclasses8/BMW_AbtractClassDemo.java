package Oops_Abstractclasses8;

public class BMW_AbtractClassDemo extends Cars{

	public static void main(String[] args) {
		BMW_AbtractClassDemo b= new BMW_AbtractClassDemo();
		b.carMake("bmw");
		
		
		
		

	}

	@Override// whether implementing or not abstract methods should have presence in child class 
	public void engine(String engineType, int NoofCylinders) {
		
	}
	
	public void carMake(String make)
	{
		this.make=make;
		System.out.println("Car make is :"+make);
		
	}
	//super is not used to invoke methods from parent abstract class

}
