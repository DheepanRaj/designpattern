package com.pattern.creational.abstractfactory;

public class PC extends Computer{

	
	String RAM;
	String HDD;
	String CPU;
	
	PC(String RAM,String HDD,String CPU){
		this.RAM = RAM;
		this.CPU = CPU;
		this.HDD = HDD;
		
	}
	
	@Override
	String getRAM() {
		return RAM;
	}

	@Override
	String getHDD() {
		return HDD;
	}

	@Override
	String getCPU() {
		return CPU;
	}

}
