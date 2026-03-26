package com.javaintro;

public class GarbageCollection {
	
	void student1() {
		System.out.println("Class loaded");
		GarbageCollection t3= new GarbageCollection();
	}
    static void student2() {
    	
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started!!");
		GarbageCollection t1=new GarbageCollection();
		GarbageCollection t2=new GarbageCollection();
		t1=null;
		t1=t2;
		new GarbageCollection();
		
		System.out.println("main method ended!!");
		
		System.gc();

		
		
	}



}
