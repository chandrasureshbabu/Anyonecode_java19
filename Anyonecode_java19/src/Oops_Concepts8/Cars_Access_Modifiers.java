package Oops_Concepts8;

public class Cars_Access_Modifiers {
	
	protected int speed;
	
	protected String make; // this variable can accessible when only inheritance is applied outside of package 
	protected int year;
	private String model;
	
	public void  carMake(String make) {
		this.make=make;
		System.out.println("car Make :"+make);
	}
	public void makeYear(int year) {
		
		this.year=year;
		System.out.println("car make year is :"+year);
		
	}
	public void setmodel(String model)	{
		this.model= model;
		
	}
	public String getmodel() {
		return model;
		
	}
	
	protected  void speedIncrease() {
		speed++;
		System.out.println("Acceralation is "+speed);
	}
	
	protected  void speedDecrease() {
		speed--;
		System.out.println("Acceralation is "+speed);
	}
	
	
	
	

}
