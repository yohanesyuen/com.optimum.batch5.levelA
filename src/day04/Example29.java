package day04;

interface Language {
	void showLanguage();
} // end of Language

// A method with a body is called a complete method
// A method without a body is called an abstract method

abstract class Book {
	
	abstract void showBook();
}

class Java extends Book implements Language {

	@Override
	public void showLanguage() {
		
	}

	@Override
	void showBook() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Example29 {
 public static void main(String[] args) {
	
 }
}
