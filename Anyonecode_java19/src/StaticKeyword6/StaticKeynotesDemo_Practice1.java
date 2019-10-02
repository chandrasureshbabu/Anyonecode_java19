package StaticKeyword6;

public class StaticKeynotesDemo_Practice1 {
	
	
	public int addnum =10;
	public static int staticaddnum=20;
	
	
	
	public static void main(String[] args) {
		
		/*int op=add(12);// this will ask us to change add() to static ,since main static method
		 any non static belongs to object 
		System.out.println(op);*/
		
		int op1=staticAdd1(15);
		System.out.println(op1);
		// if we really need to call add() then we  need to have object of the class
		
		StaticKeynotesDemo_Practice1 s= new StaticKeynotesDemo_Practice1();
		System.out.println(s.add(12));
		

	}
	
	public int add(int num)// this is non static method 
	{
		return addnum+num;
	}
	
	
	/*public static int  staticAdd(int num)// this is static method , so it will ask us change nonstatic variable 'addnum' to static 
	{
		return addnum+num; // cannot call non static variables in staic method
	}*/
	
	public static int  staticAdd1(int num)// this is static method , so it will ask us change nonstatic variable 'addnum' to static 
	{
		return staticaddnum+num;
	}

}
