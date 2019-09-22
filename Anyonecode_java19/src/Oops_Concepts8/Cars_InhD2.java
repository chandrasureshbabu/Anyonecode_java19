package Oops_Concepts8;

public class Cars_InhD2 {
	
	int CarTopspeed;
	String CarDrive;
	
	public Cars_InhD2()
	{
		System.out.println("Super/parent class constructor ");
	}
	
	public void carDriveType(String CarDrive)
	{
		this.CarDrive=CarDrive;
		System.out.println("This "+CarDrive+"  Is common on Cars");
	}
	
	public void carSpeed(int CarTopspeed ) {
		
		this.CarTopspeed= CarTopspeed;
		System.out.println("Cars Top Speed :"+CarTopspeed);
		
	}

}
