package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Car1 {
	private String color;
	private String make;
	private String model;
	private int year;
	
	
	
	public String getmake()
	{
		return make;
	}
	
	public void setmake(String make)
	{
		this.make=make;
	}

	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

	
	public String getModel() {
		return model;
	}

	
	public void setModel(String model) {
		this.model = model;
	}

	
	public int getYear() {
		return year;
	}

	
	public void setYear(int year) {
		if(year>1900) {
		this.year = year;
		}
		else
		{
			System.out.println("not a valid Year");
		}
	}

}
