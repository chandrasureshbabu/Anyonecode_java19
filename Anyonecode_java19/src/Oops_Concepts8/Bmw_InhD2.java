package Oops_Concepts8;

public class Bmw_InhD2  extends Cars_InhD2{

	@Override
	public void carSpeed(int CarTopspeed) {
		
		//super.carSpeed(CarTopspeed);
		super.CarTopspeed=CarTopspeed;// using super keyword we are calling parent class variable
		System.out.println("BMW car speed is  :"+CarTopspeed);
	}
	
	
}
