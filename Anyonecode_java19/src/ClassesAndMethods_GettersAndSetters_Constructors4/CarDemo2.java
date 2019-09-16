package ClassesAndMethods_GettersAndSetters_Constructors4;

public class CarDemo2 {

	public static void main(String[] args) {
		Car2 bmw = new Car2(); // Create and initialize the object
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());
		
		Car2 benz = new Car2();
		benz.setMake("Benz");
		System.out.println(benz.getMake());
		
		benz.setModel("c300");
		System.out.println(benz.getModel());
		
		benz.setYear(1800);
		System.out.println(benz.getYear());
	}
}