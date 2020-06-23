package com.ibm.sentmail;

import com.ibm.inbox.Test;
import com.ibm.inbox.Test2;
import com.ibm.inbox.Test4;

public class Test3 extends Test2{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new Test();   // Access public method of Test class in Sentmail Package possible...
		t1.m1();
		
		//Test2 t2=new Test2();  // Access Default  method of Test2 class in Sentmail package is not possible...
		//t2.m2();
		
		//Test4 t4=new Test4();
		//t4.m3();	 // Access Private  method of Test4 class in Sentmail package is not possible...
		
		Test3 t3=new Test3();
		t3.m4();  //  Access Protected  method of Test2 class in Sentmail package is  possible using inheritance...


	}

}
