package com.docsconsole.tutorials.epackage;

import com.docsconsole.tutorials.epackage.MessageProvider;

public class MainClient {
	
	public static void main(String[] args) {
		
		MessageProvider provider = new MessageProvider();
		String className = provider.getMessage();
		System.out.println("Name of the Class is ::  " + className);
		
	}

}
