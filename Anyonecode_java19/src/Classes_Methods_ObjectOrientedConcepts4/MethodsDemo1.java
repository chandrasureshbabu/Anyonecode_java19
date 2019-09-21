package Classes_Methods_ObjectOrientedConcepts4;

public class MethodsDemo1 {
	
	
	public static void studentGrade(String name, int score) {
		String grade;
		if(score >=90 && score<=100)
		{
			grade="A";
		}
		else if(score>=80 && score<=90)
		{
			grade="b";
		}
		else if(score>=70 && score<=60)
		{
			grade="c";
		}else
		{
			grade="failed";
		}
		System.out.println("StudentName :"+name +" Grade is :"+ grade);
	}


	public static void main(String[] args) {
		
		
		studentGrade("jhon",92);
		studentGrade("Tom",80);
		
	}

}
