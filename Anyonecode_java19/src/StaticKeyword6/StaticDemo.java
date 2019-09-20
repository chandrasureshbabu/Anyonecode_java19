package StaticKeyword6;

public class StaticDemo {

	public static void main(String[] args) {
		StaticExampleClass s1= new StaticExampleClass("BMW");//setter constructor asking arguments
		System.out.println("Make is  "+s1.getmake());
		System.out.println("Instance  "+s1.Getinstances());
		
		StaticExampleClass s2= new StaticExampleClass("AUDI");//setter constructor asking arguments
		System.out.println("Make is  "+s2.getmake());
		System.out.println("Instance  "+s2.Getinstances());// Still printing instance as 1 since it is new object ,getinstance is not static 
		

	}

}
