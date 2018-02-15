package day02;

// Casting

class CastingDemo {
	// implicit casting: small type to big type
	int iVar = 20;
	long lVar = iVar; // JVM does the conversion
	
	// explicit casting: big types to small types
	double dVar = 20.56;
	float fVar = (float) dVar; // Programmer gotta cast manually
	 
	// Up Casting
	String str = "Java";
	Object obj = str;
	
	// Down casting
	Object obj1 = "Oracle";
	String str1 = (String) obj1;
	
	// Auto boxing
	int myVariable = 100;
	Integer myReference = myVariable;
	
	// Un Boxing
	Float fReference = 10.23F;
	float fVariable = fReference;
	
	@Override
	public String toString() {
		return "CastingDemo [iVar=" + iVar + ", lVar=" + lVar + ", dVar=" + dVar
				+ ", fVar=" + fVar + ", str=" + str + ", obj=" + obj + ", obj1=" + obj1
				+ ", str1=" + str1 + ", myVariable=" + myVariable + ", myReference="
				+ myReference + ", fReference=" + fReference + ", fVariable="
				+ fVariable + "]";
	}
	
}
public class Example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CastingDemo demo = new CastingDemo();
		System.out.println(demo);
	}

}
