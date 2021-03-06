package com.pattern.creational.abstractfactory;

public class ComputerFactory {

	static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
	
}
