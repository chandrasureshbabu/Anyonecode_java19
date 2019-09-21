package JavaConcepts_DataTypes_3;

import java.util.Arrays;

public class ArrayDemo_Practice1 {
	
public static void main(String[] args) {
		
		String[] Sarray= {"XINX","BMW"};
		
		/*Sarray[2]="SBN";
		Sarray[3]="audi";
		Sarray[4]="CNB";
		Sarray[5]="DFG";
		Sarray[6]="Make";*/
		
		
		Arrays.sort(Sarray);//this will sort
		
		for(String s:Sarray)
		{
			System.out.println(s);
		}
		
	}
	

}
