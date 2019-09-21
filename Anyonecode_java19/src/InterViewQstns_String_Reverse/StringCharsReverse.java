package InterViewQstns_String_Reverse;

import java.util.Scanner;

public class StringCharsReverse {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter ur say");
		String original =scan.nextLine();
		
		
		if(original.isEmpty()||original==null) {
			System.out.println("Please enter what ur thinking");
			original=scan.nextLine();
			
		}
		scan.close();
		StringCharsReverse src=new StringCharsReverse();
		String Reversechars=src.reversechars(original);
		System.out.println(Reversechars);
		
		
		
		

	}
	
	public String reversechars(String Originalstring)
	{	
		
		String Reverse="";
		for(int i=Originalstring.length()-1;i>=0;i--) {
			
			Reverse=Reverse+Originalstring.charAt(i);
		
		}
		return Reverse;
	}

}
