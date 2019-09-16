package ClassesAndMethods_GettersAndSetters_Constructors4;

public class CarDemo1 {

	public static void main(String[] args) {
		
		
		Car1 bmw= new Car1();
		bmw.setmake("BMW");
		System.out.println(bmw.getmake());
		
		Car1 benz=new Car1();
		
		benz.setmake("MERC");
		System.out.println(benz.getmake());
		
		benz.setModel("Sclass");
		System.out.println(benz.getModel());
		
		benz.setYear(2020);
		System.out.println(benz.getYear());

	}

}
