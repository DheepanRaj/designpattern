package com.pattern.creational.singleton;

public class ThreadSafeSingleton {

	public static ThreadSafeSingleton instance = null;
	
	private ThreadSafeSingleton(){
		
	}
	
	public static ThreadSafeSingleton getInstance(){
		
		synchronized (ThreadSafeSingleton.class) {
			if(instance == null){
				instance = new ThreadSafeSingleton();
			}
		}
		return instance;
	}
			
	
}
