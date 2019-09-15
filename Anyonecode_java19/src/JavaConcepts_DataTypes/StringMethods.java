package JavaConcepts_DataTypes;

import java.nio.charset.Charset;

public class StringMethods {

	public static void main(String[] args) {
		String str = "This is the test string";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "            Spaces all around     ";
		String str6 = "Hello";
		
		System.out.println("String length :"+str1.length());
		System.out.println("getting char specific indiex : "+str1.charAt(1));
		System.out.println("This is to append string "+ str1.concat(" Hyd"));
		System.out.println("this is check string ocntains specified string or not :"+str5.contains("all"));
		System.out.println("this is check string ocntains specified string or not :"+str5.contains("lla"));
		System.out.println("String ends specific string or not :' Hello '"+str1.endsWith("Hello"));
		System.out.println("String ends specific string or not :' space '"+str5.endsWith(" "));
		System.out.println("Comparing 2 strings :"+str1.equals(str2));
		System.out.println("Comparing 2 strings :"+str1.equals(str3));
		System.out.println("getting indexof sepific char is :"+str1.indexOf('l'));
		System.out.println("checking string is empty or not :"+str1.isEmpty());
		System.out.println("checking string is empty or not :"+str4.isEmpty());
		System.out.println("trimming leading ,trailing spaces :"+str5.trim());
		System.out.println("to replace String :"+str6.replace('e', 'a'));
		System.out.println("SubString :"+str3.substring(1));
		System.out.println("SubString :"+str3.substring(1,5));
		
		
		char[] ca= str.toCharArray();
		for(int i=0; i<ca.length;i++)
		{
			System.out.println(ca[i]);
		}
		
		System.out.println("-----------------using for each---------");
				
				for(Object obj:ca ) {
					System.out.println(obj);
					
				}
	}
	
}
