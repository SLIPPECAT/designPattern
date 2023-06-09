package com.example.designpattern.singletonPattern;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance(){
		if (uniqueInstance == null){
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()){
			// 끓인 재료를 다음 단계로 넘김
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
