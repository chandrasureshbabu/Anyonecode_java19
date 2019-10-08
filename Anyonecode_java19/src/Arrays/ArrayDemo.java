package Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		//array can be declared in many ways
		double[] salary= new double[10]; //here we declared size as 10(index0 to 9)
		// in below month array of type string initialized while declared
		String month[]= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		
		// if we pass value 10 th index , it will throw out index error for salary arrray , since initialized while declaring its size is 12(0-11) only.
		/*month[12]="Test out index";
		System.out.println(month.length);*/
		
		// initialized salary
		salary[0]=10000;
		salary[1]=20000;
		salary[2]=30000;
		salary[3]=40000;
		salary[4]=50000;
		
		salary[5]=60000;
		salary[6]=70000;
		salary[7]=80000;
		salary[8]=90000;
		salary[9]=100000;
		
		
		
		
		// if we pass value 10 th index , it will throw out index error for salary arrray , since we declared its size is 10 only.
		/*salary[10]=110000;
		
		System.out.println(salary.length);*/
		System.out.println("...using for ........");
		for(int i=0;i<salary.length;i++)
		{
			System.out.println(salary[i]);
		}
		System.out.println("...using for each........");
		for(double j:salary)
		{
			System.out.println(j);
		}
		
		System.out.println("...........");
		for(String s:month)
		{
			System.out.println(s);
		}
		
		

	}

}
