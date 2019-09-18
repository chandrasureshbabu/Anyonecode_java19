package Conditional_StatementsAndLoops5;

public class DoWhile_loop {

	public static void main(String[] args) {
		int i=10;
		while (i<10)
		{
			System.out.println(i);
			i++;// it never executes as i is already 10
		}
		
		do {
			
			System.out.println(i);// it will do first iteration always before checking while condition 
			i++;
		}while(i<10);

	}

}
