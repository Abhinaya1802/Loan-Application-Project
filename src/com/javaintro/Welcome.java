package com.javaintro;

public class Welcome {
	static {
		Welcome t1=new Welcome();
		t1.method1();
	}
	void method1() {
		System.out.println("method1 called");
		method2();
	}
	void method2() {
		System.out.println("method2 called");
		method3();
	}
	static void method3() {
		System.out.println("method3 called");
		method4();
	}
	static void method4() {
		System.out.println("method4 called");
	}


	public static void main(String[] args) {
		System.out.println("main method started!!");
		
	}

}
