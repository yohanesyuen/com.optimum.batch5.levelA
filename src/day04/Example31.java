package day04;


// variables must be initialised when declared in interfaces
interface Office {
	int officeID=20; // final and static
	void showData();
}

class Optimum implements Office {
	@Override
	public void showData() {
		System.out.println(Office.officeID);
	}
}

public class Example31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
