package com.pattern.structural.adapter;

public class Socket {

	Volts getVolts(){
		return new Volts(120);
	}
}
