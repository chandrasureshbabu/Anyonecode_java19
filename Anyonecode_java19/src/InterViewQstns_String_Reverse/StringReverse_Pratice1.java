package InterViewQstns_String_Reverse;

public class StringReverse_Pratice1 {

	public static void main(String[] args) {
		
		String Origanlstr="This is the Java";
		//We are creating a method that has logic to print string reverse
		String Output=reverseString(Origanlstr);// since no object is created , we are creating a static method
		System.out.println(Output);//and we printing reversed string

	}
	
	public static String reverseString(String st) {
		String Reversestr=""; //nothing in "Reversestr"
		
		if(st.isEmpty()||st==null) {
			System.out.println("This is not valid String");//if String is null or empty ,we printing this
		}else if(st.length()<=0)
		{
			System.out.println(st);//if String has only one char then we then nothing to print in reverse
			
		}
		else
		{
			String[] strary=st.split("\\s+");
			for(int i=strary.length-1;i>=0;i--)
			{
				Reversestr=Reversestr+" "+strary[i];
			}
		}
		
		
		
		return Reversestr.trim();
	}

}
