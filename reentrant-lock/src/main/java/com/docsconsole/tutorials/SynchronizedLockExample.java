package com.docsconsole.tutorials;

public class SynchronizedLockExample implements Runnable{

	private SharableCounter sharableCounter;
	
	public SynchronizedLockExample(SharableCounter sharableCounter){
		this.sharableCounter = sharableCounter;
	}
	
	@Override
	public void run() {
		synchronized (sharableCounter) {
			sharableCounter.incrementCount();
		}
		sharableCounter.getCount();
	}
}