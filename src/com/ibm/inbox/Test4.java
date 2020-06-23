package com.ibm.inbox;

public class Test4 {
	
private int c=300;	// Private variable

final char ch='A';
	
	private void m3()
	{
		System.out.println("Private method of Test4: "+c);
	}

	final void m5()
	{
		System.out.println("Final method of Test4: "+ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test4 t4=new Test4();
		t4.m3();	// Access Private method of Test4 class..
		//t4.ch='B';
		t4.m5();

	}

}
