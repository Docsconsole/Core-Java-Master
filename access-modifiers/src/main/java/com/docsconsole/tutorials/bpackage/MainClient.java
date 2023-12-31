package com.docsconsole.tutorials.bpackage;

import com.docsconsole.tutorials.apackage.MessageProvider;

public class MainClient extends MessageProvider {
	
	public static void main(String[] args) {
		
		MessageProvider provider = new MessageProvider();
		String className = provider.getMessage();
		System.out.println("Name of the Class is ::  " + className);
		
	}

}
