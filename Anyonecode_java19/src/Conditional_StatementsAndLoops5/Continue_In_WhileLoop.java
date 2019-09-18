package Conditional_StatementsAndLoops5;

public class Continue_In_WhileLoop {

	public static void main(String[] args) {
		int i=10;
		
		while(i<20) {
			i++;
			if(i==17)
			{
				continue;// it skips that above 17th iteration , but continue to till the end
			}
			System.out.println(i);
		}

	}

}
