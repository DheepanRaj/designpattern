package com.pattern.creational.factory;

public class ComputerFactory {

	static Computer getItems(String type,String RAM,String HDD,String CPU){
		switch (type){
		
		case "PC":
			return new PC(RAM,HDD,CPU);
		}
		
		return null;
		
	}
}
