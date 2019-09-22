package Oops_Concepts8;

public class Inheritance_Demo1 {

	public static void main(String[] args) {
		Cars_InhD1 c1= new Cars_InhD1();
		c1.carDrive();//parent class object reference access its own method
		Bmw_InhD1 b1= new Bmw_InhD1();
		b1.carDrive();//child class object reference access its own method(but this method is overriden method parent class Cars_InhD1)
		b1.carspeed(10);//child class object calling parent class method.

	}

}
