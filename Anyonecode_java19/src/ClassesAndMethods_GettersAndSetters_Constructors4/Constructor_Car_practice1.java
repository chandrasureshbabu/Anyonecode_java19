package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Constructor_Car_practice1 {
	
	int gear;
	int speed;
	
	
	
	Constructor_Car_practice1(){
		//Constructor call should be first statement in the Constructor
		this(2,20);//we can call other constructor from a constructor, 
		System.out.println("Constructor 1");
		//this.gear=0;// assign default value this instance only
		//this.speed=0;// assign default value this instance only
		
	}
	
	Constructor_Car_practice1(int gear, int speed){
		System.out.println("Constructor 2");
		this.gear=gear;
		this.speed=speed;
	}
	
	

}
