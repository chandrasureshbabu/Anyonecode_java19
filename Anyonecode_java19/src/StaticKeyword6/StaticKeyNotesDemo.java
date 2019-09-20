package StaticKeyword6;

public class StaticKeyNotesDemo {
	public int addnum=5;
	public static int staticaddnum=10;

	public static void main(String[] args) {
		
		
		
		//int output=sum(10);// cannot refer /use non static methods or variables in static methods ,here main method is static one
		//to call non static methods in static methods we should have object of the class
		StaticKeyNotesDemo s1= new StaticKeyNotesDemo();
		//now we can call non static methods using object reference.
		int output=s1.sum(10);
		System.out.println("nonstaticSum is :"+output);
		int output1=staticsum(15);
		System.out.println("sum  is :"+output1);
		

	}
	
	public int sum(int num) {
		return num+addnum;
	}
	
	public static int staticsum(int num) {
		return num+staticaddnum;
	}

}
