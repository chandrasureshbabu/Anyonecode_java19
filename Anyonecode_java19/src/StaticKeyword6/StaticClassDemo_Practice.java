package StaticKeyword6;

public class StaticClassDemo_Practice {
	
	private String make;
	private int InstanceNum;
	
	public StaticClassDemo_Practice(String make)//declaring constructor , using it as setter 
	{
		
		this.make=make;
		InstanceNum++;
	}
	
	public String getMake() //getter 
	{
		return this.make;
	}
	
	public int getInstanceNum() //getter
	{
		return InstanceNum;
	}
	

}
