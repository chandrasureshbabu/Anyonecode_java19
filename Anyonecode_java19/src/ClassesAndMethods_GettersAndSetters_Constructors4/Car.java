package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Car {
	private String color;
	private String make;
	private String model;
	private int year;
	
	
	
	
	public String getmake() {
		return this.make;
	}
	public  void setmake(String make)
	{
		this.make=make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getmodel()
	{
		return model;
	}
	public void setmodl(String model)
	{
		this.model=model;
	}
	public int getyear()
	{
		return year;
	}
	public void setyear(int year)
	{
		this.year=year;
	}
	

}
