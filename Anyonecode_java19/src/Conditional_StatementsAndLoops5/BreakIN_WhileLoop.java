package Conditional_StatementsAndLoops5;

public class BreakIN_WhileLoop {

	public static void main(String[] args) {
		int i=10;
		
		while(i<20) {
			
			i++;
			
			if(i==17) {
				break;// check for above condition then break the iteration 
			}
			System.out.println(i);
		}

		System.out.println("Out of Index...");
	}

}
