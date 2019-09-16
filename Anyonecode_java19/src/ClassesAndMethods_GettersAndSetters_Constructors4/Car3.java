package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Car3 {
	
	
	
	
	private String make;
	int speed;
	int gear;
	
	public Car3()
	{
		this(10,2);
		System.out.println("Constructor with out arguments ");
		
	}
	
	public Car3(int s,int g) 
	{
		this.speed=s;
		this.gear=g;
		System.out.println("Constructor with  arguments");
	}
	
	public  void setmake(String make)
	{
		this.make=make;
	}
	
	public String getmake()
	{
		return make;
	}

}
