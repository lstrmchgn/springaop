package com.morningstar.aop.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
//		advice
		System.out.println("Circle's setter called");
		throw(new RuntimeException());
	}
	
	public String setNameandReturn(String name) {
		this.name = name;
//		advice
		System.out.println("Circle's setter called");
		return name;
	}
}
