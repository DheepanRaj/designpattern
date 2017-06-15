package com.pattern.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton(){
		
	}
	
	public static class BillPughSingletonHelper {
		private static BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		return BillPughSingletonHelper.INSTANCE;
	}
	
}
