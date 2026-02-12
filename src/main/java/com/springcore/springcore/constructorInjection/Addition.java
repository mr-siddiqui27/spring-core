package com.springcore.springcore.constructorInjection;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Contructor: int int");
	}
	
	public Addition(double a, int b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Contructor: double int");
	}
	
	public Addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Contructor: String String");
	}

	@Override
	public String toString() {
		return  "Addition = "+(a+b);
	}
	
	
}
