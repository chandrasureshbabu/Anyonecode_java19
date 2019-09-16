package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Constructor_Demo {

	public static void main(String[] args) {
		
		
		Car3 c3=new Car3();
		c3.setmake("BMW");
		System.out.println(c3.getmake());
		
		Car3 c31=new Car3(15, 1);
		System.out.println(c31.gear);
		System.out.println(c31.speed);
		
		
		

	}

}
