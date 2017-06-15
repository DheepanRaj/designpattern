package com.pattern.creational.builder;

public class Computer {

	String RAM;
	String HDD;
	String CPU;
	
	boolean isBlutooth;
	boolean isWIFI;
	
	private Computer(ComputerBuilder builder){
		this.RAM=builder.RAM;
		this.CPU =builder.CPU;
		this.HDD = builder.HDD;
		this.isBlutooth = builder.isBlutooth;
		this.isWIFI = builder.isWIFI;
	}
	
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public String getCPU() {
		return CPU;
	}
	public boolean isBlutooth() {
		return isBlutooth;
	}
	public boolean isWIFI() {
		return isWIFI;
	}
	
	public static class ComputerBuilder{
		
		String RAM;
		String HDD;
		String CPU;
		
		boolean isBlutooth;
		boolean isWIFI;
		
		ComputerBuilder(){
			
		}
		
		ComputerBuilder(String RAM,String HDD,String CPU){
			this.RAM = RAM;
			this.HDD= HDD;
			this.CPU = CPU;
		}
		
		ComputerBuilder setBlutoothEnable(){
			this.isBlutooth = true;
			return this;
		}
		
		
		ComputerBuilder setWifiEnable(){
			this.isWIFI = true;
			return this;
		}
		
		Computer build(){
			return new Computer(this);
		}
		
	}
	
	
	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		Computer comp = new Computer.ComputerBuilder("", "", "").setBlutoothEnable().setWifiEnable().build();
		comp.toString();
	}
	
}
