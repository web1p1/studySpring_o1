package com.wind.s07;

import javax.annotation.*;

public class OtherStudent {
	private String name;
	private int age;
	
	public OtherStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { return name; }
	public int getAge() { return age; }
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }

	@SuppressWarnings("restriction")
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod()");
	}
	
	@SuppressWarnings("restriction")
	@PreDestroy
	public void destoryMethod() {
		System.out.println("destoryMethod()");
	}
	
}
