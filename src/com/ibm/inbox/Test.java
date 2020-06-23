package com.ibm.inbox;

public class Test {
	
	public int a=200;
	public void m1()
	{
		System.out.println("Public method of Test Class: "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();  // Access public method of Test class
		t.m1();
		
		Test2 t2=new Test2();   // Access Default  method of Test2 class in Same Package Test class possible..
		t2.m2();
		
		t2.m4();  // Access Protected  method of Test2 class in Same Package Test class possible

	}

}
