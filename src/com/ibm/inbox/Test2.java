package com.ibm.inbox;

public class Test2 {
	
	int b=100; // default variable
	void m2()	// default method
	{
		System.out.println("Default method of Test2 Class:"+b);
		
	}
	
	protected int d=400; // Protected variable
	protected void m4()
	{
		System.out.println("Protected method of Test2 class: "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test(); 
		t.m1();		 // Access public method of Test class in Test2 class same package possible..
		
		Test2 t2=new Test2(); 
		t2.m2();	 // Access Default method of Test2 class
		
		Test4 t4=new Test4();
		//System.out.println(t4.ch);
		//t4.m3();	// Access Private method of Test4 class in Test2 class same package not possible ..
		
		t4.m5();  // Access Final method of Test4 class in Test2 class  possible...
		System.out.println(t4.ch);
		
		
		t2.m4();  // Access Protected method of Test2 class...
		


	}

}
