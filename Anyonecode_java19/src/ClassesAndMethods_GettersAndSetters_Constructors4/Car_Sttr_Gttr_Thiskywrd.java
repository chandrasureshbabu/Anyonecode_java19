package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Car_Sttr_Gttr_Thiskywrd {
	
	private String make;
	private int year;
	private String model;
	
	
	public String getMake()
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make=make;
	}
	////////////////////////////////////////////////
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		if(year>2000) {
		this.year=year;
		}else
		{
			System.out.println("Model not available in the Year :"+year);
		}
	}
	////////////////////////////////////////////////
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	

}
