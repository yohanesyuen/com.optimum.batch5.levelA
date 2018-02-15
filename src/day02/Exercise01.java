package day02;

class Mobile {
	private WhatsApp refWhatsApp = new WhatsApp();

	public WhatsApp getRefWhatsApp() {
		return refWhatsApp;
	}

	public void setRefWhatsApp(WhatsApp refWhatsApp) {
		this.refWhatsApp = refWhatsApp;
	}
}
class WhatsApp {
	private Chat refChat = new Chat();

	public Chat getRefChat() {
		return refChat;
	}

	public void setRefChat(Chat refChat) {
		this.refChat = refChat;
	}
}
class Chat {
	private String message = new String();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

public class Exercise01 {
	public static void main(String[] args) {
		Mobile refMobile = new Mobile();
		WhatsApp refWhatsApp = new WhatsApp();
		Chat refChat = new Chat();
		
		refChat.setMessage("Hello Boon!");
		refWhatsApp.setRefChat(refChat);
		refMobile.setRefWhatsApp(refWhatsApp);
		System.out.println(refMobile
				.getRefWhatsApp()
				.getRefChat()
				.getMessage());
	}
}
