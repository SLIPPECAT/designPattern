package com.example.designpattern.decorationPattern.coffee;

public abstract class Beverage {

	public enum Size { TALL, GRANDE, VENTI};
	Size size = Size.TALL;
	String description = "제목 없음";
	public String getDescription() {
		return description;
	}
	public void setSize(Size size){
		this.size = size;
	}
	public Size getSize(){
		return this.size;
	}

	public abstract double cost();


}
//
//	double cost = 3000;
//
//	boolean milk;
//
//	boolean soy;
//
//	boolean mocha;
//
//	boolean whip;
//
//	public double cost() {
//		return this.cost;
//	}
//
//	public boolean hasMilk(){
//		return milk;
//	}
//
//	public void setMilk(boolean milk){
//		this.milk = milk;
//	}
//
//	public boolean hasSoy(){
//		return soy;
//	}
//
//	public void setSoy(boolean soy){
//		this.soy = soy;
//	}
//
//	public boolean hasMocha(){
//		return mocha;
//	}
//
//	public void setMocha(boolean mocha){
//		this.mocha = mocha;
//	}
//
//	public boolean hasWhip(){
//		return whip;
//	}
//
//	public void setWhip(boolean whip){
//		this.whip = whip;
//	}
//
//}
