package day01;

// method with return type

class Language {
	
	void showLanguage1() {
		Debugger.debug();
	} // end of showLanguage1
	
	String showLanguage2() {
		return "Java";
	} // end of showLanguage2
	
	int showLanguage3(int LanguageID) {
		return LanguageID;
	} // end of showLanguage3
	
	boolean showLanguage4(boolean status) {
		return status;
	} // end of showLanguage4
	
	String showLanguage5(int i, String s, boolean b, double d) {
		return String.format("%d %s %b %.02f", i, s, b, d);
	} // end of showLanguage5
} // end of Language

public class Example06 {

	public static void main(String[] args) {
		Language refLanguage = new Language();
		refLanguage.showLanguage1();
		System.out.println(refLanguage.showLanguage2());
		System.out.println(refLanguage.showLanguage3(10));
		System.out.println(refLanguage.showLanguage4(true));
		System.out.println(refLanguage.showLanguage5(100, "Java2", false, 52.5));
	} // end of main

} // end of Example06
