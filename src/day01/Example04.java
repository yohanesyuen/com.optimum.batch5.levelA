package day01;

class Person {
	int personAge = 20;
	
	void showPersonAge(int personAge) {
		personAge = personAge+10;
		System.out.println(personAge);
	} // end of show
	
	void display() {
		System.out.println(personAge);
	}
} // end of Person

public class Example04 {

	public static void main(String[] args) {
		Person personRef = new Person();
		personRef.showPersonAge(5);
		personRef.display();
	} // end of main

} // end of Example04
