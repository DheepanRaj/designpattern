package com.pattern.structural.adapter;

public class SocketAbstractImpl implements AbstractAdapter{

	@Override
	public Volts get120Volt() {
		return new Volts(120);
	}

	@Override
	public Volts get12Volt() {
		return new Volts(12);
	}

	@Override
	public Volts get3Volt() {
		return new Volts(3);
	}

}
