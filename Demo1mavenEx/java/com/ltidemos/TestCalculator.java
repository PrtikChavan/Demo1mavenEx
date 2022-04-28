package com.ltidemos;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int r=c.addNos(100, 200);
		System.out.println("Addition is :"+r);
		
		int p=c.subNos(500, 150);
		System.out.println("Substraction is :"+p);

	}

}
