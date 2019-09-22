package Oops_Concepts8;

public class Inheritance_Demo2 {

	public static void main(String[] args) {
		
		Cars_InhD2 c1= new Cars_InhD2();
		c1.carDriveType("AWD");//parent class object reference access its own method
		Bmw_InhD2 b1= new Bmw_InhD2();
		b1.carDriveType("4WD");//child class object reference access its own method(but this method is overriden method parent class Cars_InhD1)
		b1.carSpeed(350);//child class object calling parent class method.
		//since parent has constructor (defined ) so its go to invoke every time when we called from parent class directly or though the sub class 
		

	}

}
