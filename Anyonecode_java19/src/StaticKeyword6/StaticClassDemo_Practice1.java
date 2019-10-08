package StaticKeyword6;

public class StaticClassDemo_Practice1 {
	private static String Drivemode = "Fdrive"; //drive mode constant on given cars , so we initialized here 
	private String make;  //Declared only
	private static int InstanceNum; //Declared only
	
	public StaticClassDemo_Practice1(String make)//declaring constructor , using it as setter 
	{
		
		this.make=make;
		InstanceNum++;
	}
	
	public String getMake() //getter 
	{
		return this.make;
	}
	
	public static  int getInstanceNum() //getter
	{
		return InstanceNum;
	}
	
}
