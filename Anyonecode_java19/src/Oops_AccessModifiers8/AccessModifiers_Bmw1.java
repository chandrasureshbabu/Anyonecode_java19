package Oops_AccessModifiers8;

import Oops_Concepts8.Cars_Access_Modifiers;

public class AccessModifiers_Bmw1 extends Cars_Access_Modifiers {
	
	
	public void  carMake(String make) {  //overrides the method of surper class from other package 
		this.make=make; //this.make represents the proctected variable of super class from oher package
		System.out.println("car Make :"+make);
		
		
	}
	
	
	
	
	

}
