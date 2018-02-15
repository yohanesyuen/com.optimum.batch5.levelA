package day02;

class University {
	Faculty refFaculty;

	public Faculty getFaculty() {
		return refFaculty;
	}

	public void setFaculty(Faculty refFaculty) {
		this.refFaculty = refFaculty;
	}
}

class Faculty {
	void showFaculty() {
		System.out.println("hello");
	}
}

public class Example12 {

	public static void main(String[] args) {
		University refUniversity = new University();
		refUniversity.setFaculty(new Faculty());
		refUniversity.getFaculty().showFaculty();
	}

}
