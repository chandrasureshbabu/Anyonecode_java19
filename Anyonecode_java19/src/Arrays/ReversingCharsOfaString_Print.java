package Arrays;

import java.util.Scanner;

public class ReversingCharsOfaString_Print {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter....");
		String input=scan.nextLine();
		String output=reversingChars(input);
		System.out.println(output);
		
		

	}
	
	public  static String reversingChars(String input) {
		String reverse="";
		
		if(input.isEmpty()||input==null)
		{
			System.out.println("Please enter valid .....");
		}
		else if(input.length()<=0)
		{
			reverse=input;
		} else 
		{
			for(int i=input.length()-1;i>=0;i--)
			{
				reverse=reverse+input.charAt(i);
			}
		}
		
		return reverse.trim();
	}

}
