package Oops_Interfaces8;

import java.util.Scanner;

public class InterfaceDemo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter you BMW car model...");
		String cm= scan.next();
		
		while(cm.isEmpty()||cm==null) {
			System.out.println("Please enter car model.....");
			cm= scan.next();
		}
		scan.close();
		
		Car_BMW1 b= new Car_BMW1();//creating object of bmw class
		
		String model1= b.carModel(cm);// assign user input to carmodel method argument 
		
		b.carEngine(model1);// using object we are retrieving car engine type based on user input 

	}

}
