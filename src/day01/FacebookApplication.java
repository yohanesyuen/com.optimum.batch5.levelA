package day01;

import java.math.BigInteger;
import java.security.*;

class Facebook {
	int activeUser = -1;
	int adminID = 100;
	String adminPasswordHash = "06c562a9ff687d71fde82888d6dea853";
	void loginAuthenticate(int userId, String password) {
		if (userId != 100) {
			System.out.println("User not found!");
			return;
		}
		if (userId == 100 && !getDigest(password).equals(adminPasswordHash)) {
			System.out.println("Password is incorrect... :(");
			return;
		}
		activeUser = userId;
		showHomePage();
	} // end of loginAuthenticate
	
	void showHomePage() {
		if (activeUser > 0) {
			System.out.println("Hi " + activeUser + "! Welcome back to theFacebook! :D");
		} else {
			System.out.println("You are not logged in.. :(");
		}
		
	} // end of showHomePage
	
	
	static String getDigest(String inp) {
		MessageDigest m;
		byte[] digest;
		try {
			m = MessageDigest.getInstance("MD5");
			m.reset();
			m.update(inp.getBytes());
			digest = m.digest();
			BigInteger bigInt = new BigInteger(1,digest);
			String hashtext = bigInt.toString(16);
			// Now we need to zero pad it if you actually want the full 32 chars.
			while(hashtext.length() < 32 ){
			  hashtext = "0"+hashtext;
			}
			return hashtext;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}
	} // end of getDigest 	
} // end of Facebook

public class FacebookApplication {

	public static void main(String[] args) {
		Facebook refFacebook = new Facebook();
		refFacebook.loginAuthenticate(101, "155509");
		refFacebook.loginAuthenticate(100, "155510");
		refFacebook.loginAuthenticate(100, "155509");
	} // end of main

} // end of FacebookApplication
