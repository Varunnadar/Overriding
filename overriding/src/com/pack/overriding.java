package com.pack;

class New{
	void meth1(int a) {
		System.out.println(a);
		
	}
	void meth1(String a) {
		System.out.println(a);
	}

}
class Old extends New{
	void meth1(String a) {
		System.out.println(a);
		
	}
	
}

public class overriding {
	public static void main(String[] args) {
		Old obj=new Old();
		obj.meth1(12);
		obj.meth1("varun");
		obj.meth1("joe");
		
	}
	
	

}
