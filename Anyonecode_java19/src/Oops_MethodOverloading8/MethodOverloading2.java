package Oops_MethodOverloading8;

public class MethodOverloading2 {

public static void main(String[] args) {
	
	// same methods but have parameters of the methods are different
		
		MethodOverloading2 obj= new MethodOverloading2();
		obj.personHeight(2);
		obj.personHeight("8");

	}
	
	public  void  personHeight(int Height)
	{
		System.out.println("Height :"+Height);
	}
	
	public void personHeight(String Height)
	{
		
			System.out.println("Height :"+Height);
		
	}

}
