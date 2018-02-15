package day04;

interface Mobile {
	void showMobile();
}

class MyMobile {
	Mobile refMobile = new Mobile() {
		
		@Override
		public void showMobile() {
			System.out.println("My Mobile...");
			
		}
	};
}

public class Example32 {

	public static void main(String[] args) {
		Mobile ref = new MyMobile().refMobile;
		ref.showMobile();
	}

}
