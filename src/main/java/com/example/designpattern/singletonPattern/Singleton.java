package com.example.designpattern.singletonPattern;

public class Singleton {

//	private static Singleton uniqueInstance;
//	 volatile은 멀티쓰레딩을 쓰더라도 uniqueInstance 변수가 Singleton인스턴로 초기화되는 과정이올바르게 진행됨
	private volatile static Singleton uniqueInstance;
//	private static Singleton uniqueInstance = new Singleton();

	// 기타 인스턴스 변수

	private Singleton() {}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null){
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

	// 동기화로 멀티스레딩 문제 해결
//	public static synchronized Singleton getInstance() {
//		if (uniqueInstance == null) {
//			uniqueInstance = new Singleton();
//		}
//		return uniqueInstance;
//	}

	// 기타 메소드

}
