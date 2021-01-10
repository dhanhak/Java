package com.test01;

public class MethodTest02 {
	
	public static void main(String[] args) {
		//method호출 방법
		//1.static method : class.method();
		MethodTest01.PublicMethod();
		MethodTest01.ProtectedMethod();
		MethodTest01.defaultMethod();
	//	MethodTest01.privateMethod();   //privateMethod는 해당 class내에서만 (non visible)
	//	MethodTest01.abc(); 			//abc는 없다. (undefined)
		
		
		//2. non-static method
		//class(참조타입) 변수 = new class();
		//변수.method();
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
		
		//objectaid
		// UML : Unified Modeling Lang
	}

}
