package InterViewQstns_String_Reverse;

import java.util.Scanner;

public class StringCharsReverse_Pratice {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter...");
		String Original=scan.nextLine();
		
		while (Original.isEmpty()||Original==null) {
			System.out.println("this is not a valid String");
			Original=scan.nextLine();
		}
		scan.close();
		StringCharsReverse_Pratice obj= new StringCharsReverse_Pratice();
		String Output=obj.reverseChars(Original);
		System.out.println(Output);
				

	}
	
	public String reverseChars(String str) {
		String Reverse="";
		
		if(str.isEmpty()||str==null)
		{
			System.out.println("this is not a valid String");
		}else if(str.length()<=0)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=str.length()-1;i>=0;i--)
			{
				Reverse=Reverse+str.charAt(i);
			}
		}
		
		return Reverse;
	}
	
	

}
