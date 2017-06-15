package com.pattern.creational.prototype;

public class SampleProtoType implements Cloneable{
	int a,b; 
	
	SampleProtoType(){
		this.a=a;
		this.b=b;
	}
	
	SampleProtoType(SampleProtoType sam){
		this.a=sam.a;
		this.b=sam.b;
	}
	
	
	@Override
	protected SampleProtoType clone() throws CloneNotSupportedException {
		return new SampleProtoType(this);
	}
}
