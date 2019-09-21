package InterViewQstns_String_Reverse;

public class StringReverse {

	public static void main(String[] args) {
		
		String orginal="This is a test string";
		String Reverse=reverse(orginal);
		System.out.println(Reverse);

	}
	
	public static String reverse(String original) {
		
		String Reverse="";// this variable scope is with in  this method only, and this String Reverse holds nothing
		
		if(original.isEmpty()||original==null)
		{
			System.out.println("Please a valid String/Ur sentence ");
		}else if(original.length()==0)
		{
			System.out.println(original);
		}else {
			
			String[] originalarray=original.split("\\s+");
			
			for(String str:originalarray) {
				
				Reverse=str+" "+Reverse;
				
			}
		}
			
			return Reverse;
		
		
		
	}

}
