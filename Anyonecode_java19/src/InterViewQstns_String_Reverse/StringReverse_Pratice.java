package InterViewQstns_String_Reverse;

import java.util.Scanner;

public class StringReverse_Pratice {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your... say..");
		String str=scan.nextLine();
		
		
		if(str.isEmpty()|| str==null)
		{
			System.out.println("Please enter ur.... sayyy..");
			str=scan.nextLine();
		}
		scan.close();
		
		String Output=reverseString(str);// assign static method ""reverseString" return value to "Output" String Var, printing it below.
		System.out.println(Output);

	}
	
	   private static String reverseString(String originalstr)
	   {
		   String ReverseStr="";// this hold nothing.
		   
		   if(originalstr.length()<=0)
		   {
			   System.out.println(originalstr);
		   }else
		   {
			   String[] Reversearray=originalstr.split("\\s+");//splitting array based on spaces
			   for(String st:Reversearray) {
				   
				   System.out.println("each word :"+st);//String before reversing
				   
				   
				 ReverseStr=st+" "+ReverseStr;  //this entire logic to print in reverse
				   
				   			   }
			   
		   }
		   
		   return ReverseStr.trim();
	   }

}
