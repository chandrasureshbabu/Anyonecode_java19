package StaticKeyword6;

public class StaticDemo_Practice {

	public static void main(String[] args) {
		StaticClassDemo_Practice s1= new StaticClassDemo_Practice("BMw"); // since class 'StaticClassDemo_Pratice'has constructor with parameters , we have passed arguments.
		System.out.println("Make of the car :"+s1.getMake());
		//System.out.println(s1.make);//we cant call private field variable 
		System.out.println("Instance no is "+s1.getInstanceNum());
		
		
		StaticClassDemo_Practice s2= new StaticClassDemo_Practice("BEnz"); // since class 'StaticClassDemo_Pratice'has constructor with parameters , we have passed arguments.
		System.out.println("Make of the car :"+s2.getMake());
		//System.out.println(s1.InstanceNum);//we cant call private field variable 
		System.out.println("Instance no is "+s2.getInstanceNum());

	}

}
