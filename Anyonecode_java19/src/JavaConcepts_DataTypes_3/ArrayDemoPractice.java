package JavaConcepts_DataTypes_3;

import java.util.Arrays;

public class ArrayDemoPractice {

	public static void main(String[] args) {
		
		int[] ia= new int[6]; //since its size is  declared , static array.
		ia[0]=1;
		ia[1]=2;
		ia[2]=8;
		ia[3]=4;
		ia[4]=5;
		ia[5]=0;
		
	Arrays.sort(ia); // this sort array
		
		for(int i=0;i<ia.length;i++)
		{
			System.out.println(ia[i]);
		}
		
		
		

	}

}
