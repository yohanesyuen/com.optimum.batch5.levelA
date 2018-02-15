package day01;

//class Bank {
//	
//}

public class Example02 {
	int variable1 = 100;
	static int variable2 = 50;
	
	public static void main(String[] args) {
		System.out.println(variable2);
		
		// When trying to call a non-static data member from a static method,
		// an object of that class MUST be created.
		
		Example02 ref = new Example02(); 
		System.out.println(ref.variable1);
	} // end of main
} // end of class Example02
