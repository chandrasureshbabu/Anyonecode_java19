package StaticKeyword6;

public class StaticDemo_Practice1 {

	public static void main(String[] args) {
		StaticClassDemo_Practice1 s1 = new StaticClassDemo_Practice1("BMW");
		System.out.println("Make of the car :"+s1.getMake());
		System.out.println("Instance :"+s1.getInstanceNum());
		//System.out.println("Drive of the car :"+s1.Drivemode);//we cannot access private variables using object 
		//System.out.println("Drive of the car :"+StaticClassDemo_Practice1.Drivemode)////we cannot access private variables using using class aswell , but we can get using getters setters
		
		StaticClassDemo_Practice1 s2 = new StaticClassDemo_Practice1("Benz");
		System.out.println("Make of the car :"+s2.getMake());
		System.out.println("Instance :"+StaticClassDemo_Practice1.getInstanceNum());//if we need to access method using using class name then it has be static
	}

}
