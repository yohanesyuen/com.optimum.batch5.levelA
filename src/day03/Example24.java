package day03;

class Faculty {
	private Faculty refFaculty;
	
	Faculty showFaculty() {
		refFaculty = new Faculty();
		return refFaculty;
	}
}

class Student extends Faculty{
	private Student refStudent;
	
	@Override
	Student showFaculty() {
		refStudent = new Student();
		return refStudent;
	}
}

public class Example24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
