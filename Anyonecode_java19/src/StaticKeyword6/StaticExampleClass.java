package StaticKeyword6;

public class StaticExampleClass {
	
	private String make;
	private int Noofinstance=0;
	
	
	public StaticExampleClass(String make) { //declaring constructor , we we incrementing instances so we can geto know how many times it gets incremented.
		// we make constructor as setter method
		this.make=make;
		Noofinstance++;
	}
	
	public String getmake()
	{
		return make;
	}
	
	public int Getinstances() {
		return Noofinstance;
	}

}
