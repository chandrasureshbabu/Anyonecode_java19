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
			i++;
			System.out.println(i);
			
		}while(i<10);

	}

}
