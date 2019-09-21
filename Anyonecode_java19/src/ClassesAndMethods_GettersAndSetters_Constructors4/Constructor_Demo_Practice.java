package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Constructor_Demo_Practice {

	public static void main(String[] args) {
		Constructor_Car_practice obj= new Constructor_Car_practice();
		System.out.println("Speed is :"+obj.speed + " "+"on Gear " +obj.gear);
		Constructor_Car_practice obj1= new Constructor_Car_practice(1, 10);
		System.out.println("Speed is :"+obj1.speed + " "+"on Gear " +obj1.gear);

	}

}
