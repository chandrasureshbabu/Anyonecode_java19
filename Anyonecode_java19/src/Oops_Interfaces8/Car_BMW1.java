package Oops_Interfaces8;



public class Car_BMW1 implements Cars1 {
	
	String Enginetyp;
	int Noofcylinders;
	String carmodel;
	
	
	
	

	@Override// this isinterface method , impleted to give details car engine type based user info about model of the car
	public void carEngine(String model) {
		
		
		if(this.carmodel.equals("M4")) {
		
		System.out.println("Engine "+"V8"+" "+"Cilynders :"+"2");
		}else 
		if(this.carmodel.equals("M5"))
		{
			System.out.println("Engine "+"V8"+" "+"Cilynders :"+"4");	
		}else 
			if(this.carmodel.equals("M6"))
			{
				System.out.println("Engine "+"V12"+" "+"Cilynders :"+"5");	
			}else 
			if(this.carmodel.equals("M6"))
			{
				System.out.println("Engine "+"V12"+" "+"Cilynders :"+"5");	
			}else
			{
				System.out.println("Not a valid model");
			}
			
		
		
	}

	@Override
	public void carMake() {
		
		System.out.println("Make is :Bmw");
		
		
	}
// this method Test takes input from user , assign that user input this method argument(carmodel1) , that assigns to this class variable(carmodel) 
	@Override // this isinterface method , implemented in this class
	public String carModel(String carmodel1) {
		
		this.carmodel=carmodel1;
		
		
		return carmodel;
		
		   
		
		
	}
	
	
		
	

}
