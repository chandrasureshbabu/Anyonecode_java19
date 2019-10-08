package Arrays;

import java.util.Scanner;

public class InterViewQstns_String_Reverse_UsingScanner1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter ...");
		String input=scan.nextLine();
		String op=stringSeverse(input);
		System.out.println(op);
		
		

	}
	
	public static String stringSeverse(String s)
	{
		String reverse="";
		
		if(s.isEmpty()||s==null)
		{
			System.out.println("Please enter valid .....");
		}
		else if(s.length()<=0)
		{
			reverse=s;
		}
		else 
		{
			String Oarray[]=s.split("\\s+");
			for(String str:Oarray)
			{
				reverse=str+" "+reverse;
			}
		}
		
		return reverse;
	}

}
