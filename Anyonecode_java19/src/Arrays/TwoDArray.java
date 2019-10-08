package Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		int rows=3;
		int cols=3;
		
		int[][] rect= new int[rows][cols];		
		
		rect[0][0]=1;
		rect[0][1]=2;
		rect[0][2]=3;
		
		rect[1][0]=4;
		rect[1][1]=5;
		rect[1][2]=6;
		
		rect[2][0]=7;
		rect[2][1]=8;
		rect[2][2]=9;
		
		System.out.println(rect.length);
		System.out.println(rect[0].length);
		
		
		for(int i=0;i<rect.length;i++)
		{
			for(int j=0; j<rect[0].length;j++)
			{
				System.out.print(" "+rect[i][j]);
				
			}	
			System.out.println(" ");
		}
		

	}

}
