package day02;


class Book {
	Java refJava;
	
	Book (Java refJava) {
		this.refJava = refJava;
	}

	public Java getRefJava() {
		return refJava;
	}

	@Override
	public String toString() {
		return "Book [refJava=" + refJava + "]";
	}
}

class Java {
	private String javaReference;

//	public String getJavaReference() {
//		return javaReference;
//	}
	
	Java (String javaReference) {
		this.javaReference = javaReference;
	}

	public void setJavaReference(String javaReference) {
		this.javaReference = javaReference;
	}

	@Override
	public String toString() {
		return "Java [javaReference=" + javaReference + "]";
	}
	
}
public class Example13 {

	public static void main(String[] args) {
		Java refJava = new Java("Java Complete Reference");
		Book refBook = new Book(refJava);
		System.out.println(refBook);
	}

}
