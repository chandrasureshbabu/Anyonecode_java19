package Oops_Interfaces8;

public class BasicInterfaceTestclass_Demo {

	public static void main(String[] args) {
		BaiscClassImplements_TwoInterfacesAtaTime_Demo obj= new BaiscClassImplements_TwoInterfacesAtaTime_Demo();
		obj.carMake("BMW");
		System.out.println("Car Make Is :"+obj.getmake());
		
		obj.makeYear(2018);
		System.out.println("Car MakeYear Is :"+obj.getyear());
		
		obj.carModel("M5");
		System.out.println("CarModel Is :"+obj.getModel());
		
		obj.carEngine("V8");
		System.out.println("Car Engine Is :"+obj.getEngine());

	}

}
