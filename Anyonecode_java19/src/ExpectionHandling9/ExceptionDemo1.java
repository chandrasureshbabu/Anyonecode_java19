package ExpectionHandling9;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		Accout1 a= new Accout1();
		try {
		System.out.println("1st line ..");
		a.withdraw(1000);
		System.out.println("Thank you ...");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Please try again after some time...");
		}
	}

}
