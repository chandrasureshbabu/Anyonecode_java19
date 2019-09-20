package StaticKeyword6;

public class StaticDemo1 {
	public static void main(String[] args) {
		
		StaticExampleClass1 s1= new StaticExampleClass1("BMW");
		System.out.println("make is :"+s1.getmake());
		System.out.println("Instance :"+StaticExampleClass1.getinstance());
		
		StaticExampleClass1 s2= new StaticExampleClass1("AUDI");
		System.out.println("make is :"+s2.getmake());
		System.out.println("Instance :"+StaticExampleClass1.getinstance());
	
	}
}
