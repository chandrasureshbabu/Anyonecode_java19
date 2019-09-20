package StaticKeyword6;

public class StaticExampleClass1 {
	
	private static String make;
	private static int noofinstances=0;
	
	
	public StaticExampleClass1(String make) {
		this.make=make;
		noofinstances++;
	}
	
	public static String getmake() //since we invoking this in other class ,using this class name so make this as static method
	{
		return make;
	}
	public static int getinstance () {
		return noofinstances;
		
	}

}
