package com.example.designpattern.singletonPattern;

public class SingletonClient {

	public static void main(String[] args) {
		SingletonEnum singletonEnum = SingletonEnum.UNIQUE_INSTANCE;
		// 싱글톤 사용
		System.out.println(singletonEnum.name());
	}

}
