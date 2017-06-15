package com.rough;

public class Exprements {

	
	public static Integer add(Integer a,Integer b){
		System.err.println("called Integer");
		if(b==null){
			return 0;
		}
		return a+b;
	}
	
	public static Double add(Double a,Double b){
		
		System.err.println("called double");
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		
		float i = 10.5f;
		float f = 10.5f;
		
		add(10,null);
		
//		add(i,f);
		
	}
	
}
