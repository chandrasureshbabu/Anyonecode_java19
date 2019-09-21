package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Constructor_Car_practice {
	
	int speed;
	int gear;
	
	Constructor_Car_practice(){
		
		System.out.println("Constructor 1");
		this.gear=0;// assign default value this instance only
		this.speed=0;// assign default value this instance only
	}
	
	Constructor_Car_practice(int gear, int speed){
		
		this.gear=gear;
		this.speed=speed;
		System.out.println("Constructor 2");
	}

}
