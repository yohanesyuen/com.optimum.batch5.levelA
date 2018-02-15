package bank;

public class BusinessLogic {

	public static Bank choice(String bank) {
		Bank refBank;
		
		if (bank.equals("citi")) {
			refBank = new CitiBank();
		} else if (bank.equals("dbs")) {
			refBank = new DBSBank();
		} else if (bank.equals("posb")) {
			refBank = new POSBBank();
		} else if (bank.equals("ocbc")) {
			refBank = new OCBCBank();
		} else {
			refBank = null;
		}
		return refBank;
	}

}
