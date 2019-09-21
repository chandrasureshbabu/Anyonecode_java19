package ClassesAndMethods_GettersAndSetters_Constructors4;

public class Car_Sttr_Gttr_ThiskywrdDemo {

	public static void main(String[] args) {
		
		Car_Sttr_Gttr_Thiskywrd obj= new Car_Sttr_Gttr_Thiskywrd();
		obj.setMake("BMW");
		System.out.println(obj.getMake());
		
		obj.setModel("M4");
		System.out.println(obj.getModel());
		obj.setYear(1990);
		System.out.println(obj.getYear());
		

	}

}
