package day02;

class Debugger {
	static void debug() {
		String output = String.format("Hello from %s",
				Thread.currentThread().getStackTrace()[2].getMethodName());
		System.out.println(output);
	} // end of debug
}
