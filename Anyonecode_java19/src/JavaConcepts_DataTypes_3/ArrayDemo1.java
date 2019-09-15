package JavaConcepts_DataTypes_3;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		
		String[] str= {"bmw","Audi","RR","VW","Tata"};
		
		int[] i= new int[10];
		
		i[5]=1;
		i[6]=2;
		i[7]=3;
		i[8]=4;
		System.out.println(str.length);
		
		
		for(int j=0; j<str.length;j++)
		{
			System.out.println(str[j]);
		}
		
		
		System.out.println("-------------------------");
		
		for(String s: str) {
			System.out.println(s);
		}

	}

}
