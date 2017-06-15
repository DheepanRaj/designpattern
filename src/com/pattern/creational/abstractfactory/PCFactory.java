package com.pattern.creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory{

	String RAM;
	String CPU;
	String HDD;
	
	public PCFactory(String rAM, String cPU, String hDD) {
		RAM = rAM;
		CPU = cPU;
		HDD = hDD;
	}

	@Override
	public Computer createComputer() {
		return new PC(RAM,HDD,CPU);
	}
	
	
}
