
package com.docsconsole.tutorials.gpackage;

public class MessageProvider {

	private String message = "Claas@MessageProvider";

	private String getMessage() {
		return message;
	}
	
public static void main(String[] args) {
		
		MessageProvider provider = new MessageProvider();
		String className = provider.getMessage();
		System.out.println("Name of the Class is ::  " + className);
		
	}

}