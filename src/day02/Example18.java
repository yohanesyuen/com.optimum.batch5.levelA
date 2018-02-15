package day02;

public class Example18 {
	
	public static void main(String[] myData) {
		String temp[] = myData;
//		System.out.println(temp[3]);
		
		switch (Integer.parseInt(temp[0])) {
			case 50:
				System.out.println("Meow");
				break;
			case 20:
				System.out.println("Woof");
				break;
			default:
				System.out.println("Invalid Option!");
				break;
		}
	}
	
}
