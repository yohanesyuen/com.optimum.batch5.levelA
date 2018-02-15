package day02;

class Bank {
	Address refAddress;

	public Bank(Address refAddress) {
		this.refAddress = refAddress;
	}

	public Address getRefAddress() {
		return refAddress;
	}

	public void setRefAddress(Address refAddress) {
		this.refAddress = refAddress;
	}

	@Override
	public String toString() {
		return "Bank [refAddress=" + refAddress + "]";
	}
	
}

class Address {
	String str;

	public Address(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Address [str=" + str + "]";
	}
}

public class Example14 {
	public static void main(String[] args) {
		Bank refBank = new Bank(new Address("Bedok"));
		System.out.println(refBank.getRefAddress().getStr());
	}
}
