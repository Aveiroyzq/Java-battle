package org.lxh.demo;

public class MyDemo implements Demo {
	private String name ;
	
	public MyDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public MyDemo() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age ;
	@Override
	public void fun1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fun3() {
		// TODO Auto-generated method stub

	}

}
