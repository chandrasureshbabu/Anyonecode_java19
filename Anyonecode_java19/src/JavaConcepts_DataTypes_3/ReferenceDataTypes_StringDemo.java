package JavaConcepts_DataTypes_3;
public class ReferenceDataTypes_StringDemo {

	public static void main(String[] args) {
		// String Literal - String Constant Pool
		String str1 = "Hello";//Variable
		
		String str3 = "Hello";//Variable
		
		// String Object - Heap
		String str2 = new String("Welcome");//reference Object
		
		String str4 = new String("Welcome");//Reference Object
		
		// Strings
		
		str1 = "More Hello";
		
		String stradd = str1 +" " +str2;
		System.out.println(stradd);
	}

}