package Arrays;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class InterViewQstns_String_Reverse_UsingScanner {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter ...");
		String input=scan.nextLine();
		
		while(input.isEmpty()|| input.length()<=0)
		{
			System.out.println("Please enter valid ...");
			input=scan.nextLine();
		}
		
		String output=arrayReversePrint(input);
		System.out.println(output);

	}
	
	public static String arrayReversePrint(String input)
	{
		String reverse="";
		
		if(input.length()<=0)
		{
			reverse=input;
		}
		else
		{
		 String originalarray[]=input.split("\\s+");
		 for(String s:originalarray)
		 {
			 reverse=s+" "+reverse; 
		 }
		}
		return reverse.trim();
	}

}
