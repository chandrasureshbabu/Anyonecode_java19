package Oops_AccessModifiers8;



public class Access_Modifiers_Demo  {

	public static void main(String[] args) {
		AccessModifiers_Bmw1 b= new AccessModifiers_Bmw1();
		b.carMake("BMW");
		b.makeYear(1973);
		b.setmodel("M4");
	    
		String model=b.getmodel();
		System.out.println(model);
		
		
		

	}

}
