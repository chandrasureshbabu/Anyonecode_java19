package Arrays;

import java.util.Scanner;

public class ReversingCharsOfaString_Print1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter...");
		String input=scan.nextLine();
		
		while(input.isEmpty()||input.length()<0)
		{
			System.out.println("Please Enter String....");
			input=scan.nextLine();
		}
		
		String Output=Reversechars(input);
		System.out.println(Output);

	}
	public static String Reversechars(String s)
	{
		String rchars="";
		if(s.isEmpty()||s==null)
		{
			System.out.println("Please ..Please.... enter something");
		}
		else if(s.length()<=0)
		{
			rchars=s;
		}
		else
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				rchars=rchars+s.charAt(i);
			}
		}
		return rchars;
	}

}
