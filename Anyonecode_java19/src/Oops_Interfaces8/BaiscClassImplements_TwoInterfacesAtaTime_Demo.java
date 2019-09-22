package Oops_Interfaces8;

public class BaiscClassImplements_TwoInterfacesAtaTime_Demo  implements BasicCarInterface_Demo ,BasicBMWInterface_Demo{
// this implements two interfaces at a time
	
	String Model;
	String EngineType;
	int year;
	String make;
	@Override
	public void carModel(String Model) {
		
		this.Model=Model;
		System.out.println("BMW Interface m1");
		
	}
	
	public String getModel() { //User defined fucntion
		return Model;
		
	}

	@Override
	public void carEngine(String Type) {
		this.EngineType=Type;
		System.out.println("BMW Interface m2");
	}
	public String getEngine() { //User defined fucntion
		return EngineType; 
	}

	@Override
	public void carMake(String make) {
		this.make=make;
		
	}
	public String getmake() { //User defined fucntion
		return make; 
	}

	@Override
	public void makeYear(int Year) {
		this.year=Year;
		
	}
	public int getyear() { //User defined fucntion
		return year;
	}

}
