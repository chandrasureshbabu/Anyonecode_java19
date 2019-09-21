package Classes_Methods_ObjectOrientedConcepts4;

public class UnderstadingReturnType {

	public static void main(String[] args) {
		
		String grade=Sgrade(90);
		String name="john";
		displaygrades(name,grade);
		
		String grade1=Sgrade(80);
		String name1="john";
		displaygrades(name1,grade1);
		
		//or
		
		String grd;
		String name2;
		
		name2="jesicca";
		grd=Sgrade(90);
		
		displaygrades(name2,grd);
		
		name2="beil";
		grd=Sgrade(90);
		displaygrades(name2,grd);
		
		
		
		
		 
		

	}
	
	public static String Sgrade(int score) {
		  String grade;
		  
		  if(score>=90 && score<=100)
		  {
			  grade="A";
		  }
		  else if(score>=80 && score<=90)
		  {
			  grade="B";
		  }
		  else if(score>=70 && score<=80)
		  {
			  grade="C";
		  }else
		  {
			  grade="Failed";
		  }
		  
		  return grade;
	}
	
	public static void displaygrades(String name,String grade) {
		
		System.out.println("**************************************");
		System.out.println("Student name :"+name+" grade "+grade);
		System.out.println("**************************************");
	}

}
