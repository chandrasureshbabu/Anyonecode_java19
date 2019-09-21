package Classes_Methods_ObjectOrientedConcepts4;

public class UnderstadingReturnType_Practice {
	

	public static void main(String[] args) {
		
		
		char grd= studentGrade(90);//this catches return value of the method
		displaydetails("jimmy",grd);
		char grd1= studentGrade(81);
		displaydetails("tonny",grd1);
		
		
		

	}
	
	private static char studentGrade(int marks)
	{
		char grade;
		
		if(marks>=90 && marks<=100) 
		{
			grade='a';
		}
		else if(marks>=80 && marks <=90)
		{
			grade ='b';
		}
		else if(marks>70 && marks<=80) 
		{
			grade='c';
		}else
		{
			grade= 'd';
		}
		return grade;// this method returns grade
	}
	
	public static void displaydetails(String name, char grade)
	{
		System.out.println("**************************************");
		System.out.println("Student name :"+name+" grade "+grade);
		System.out.println("**************************************");
		
	}

}
