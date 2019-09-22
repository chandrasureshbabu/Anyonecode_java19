package Oops_MethodOverloading8;

public class MethodOverloading3 {


	public static void main(String[] args) {
		// same methods , have same arguments, but sequence of parameters/arguments are different
		MethodOverloading3 obj= new MethodOverloading3();
		obj.personHeight(true,8);
		obj.personHeight(8, true);

	}
	
	public  void  personHeight(boolean rememberheight,int Height) {
	if(rememberheight)
	{
		System.out.println("Height :"+Height+" "+"rememberheight "+"Yes");
	}else
	{
		System.out.println("i dont remember height");
	}
	}

	
	public void personHeight(int Height,boolean rememberheight)
	{
		if(rememberheight)
		{
			System.out.println("Height :"+Height+" "+"rememberheight "+"Yes");
		}else
		{
			System.out.println("i dont remember height");
		}
	}

}
