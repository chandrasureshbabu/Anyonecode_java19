package Arrays;

public class Reversing_Array_Excersize_IQ {

	public static void main(String[] args) {
		String input= "This is a String Test";
		String output= arrayReverse(input);
		System.out.println(output);

	}
	
	
	public static String arrayReverse(String input)
	{
		String reverse="";
		if(input.length()<=1)
		{
			reverse=input;
		}else
		{
			String[] originalarray= input.split("\\s+");
			for(String s:originalarray)
			{
				reverse=s+" "+reverse;
			}
		}
		
		
		
		return reverse;
		
		
	}

}
