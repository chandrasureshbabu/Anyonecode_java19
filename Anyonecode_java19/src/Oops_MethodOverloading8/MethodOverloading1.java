package Oops_MethodOverloading8;




public class MethodOverloading1 {

	public static void main(String[] args) {
		
		MethodOverloading1 obj= new MethodOverloading1();
		obj.personHeight(2);
		obj.personHeight(8, true);

	}
	
	public  void  personHeight(int Height)
	{
		System.out.println("Height :"+Height);
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
