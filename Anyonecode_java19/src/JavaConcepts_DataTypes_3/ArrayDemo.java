package JavaConcepts_DataTypes_3;

public class ArrayDemo {

	public static void main(String[] args) {
	
		 int[] myarray = new int[10];
		 myarray[1]=1;
		 myarray[2]=2;
		 myarray[3]=30;
		 myarray[4]=40;
		 myarray[0]=50;
		 
		 int len=myarray.length;
		 System.out.println(len);
		 System.out.println("----------------------print---------");
		 
		 for(int i=0;i<len;i++)
		 {
			 System.out.println(myarray[i]);
		 }
		 
		
		
	}

}
