package Classes_Methods_ObjectOrientedConcepts4;

public class MethodDemoPratice_1 {

	public static void main(String[] args) {
		
		
		studentgrade(82,"Mrake");
		studentgrade(90,"tonny");
		
		

	}
	
	
	public static void studentgrade(int marks, String name)
	{	
		char grade;
		
		if(marks>=90 && marks<=100) {
			 grade ='a';
		}else if(marks>=80 && marks<=90) {
			grade= 'b';
		}else if(marks>=70 && marks<=80)
		{
			grade='c';
		}else
		{
			grade='d';
		}
		System.out.println("Student :"+name+" ,grade is :"+grade);
		
	}

}
