package com.pract.titgtlycoupled;

public class MainMethod {
	Shape s=new Triangle();
	Shape s1=new Circle();
	
	public void test(){
		s1.drawshape();
		s.drawshape();
		
	}
	public static void main(String[] args) {
		MainMethod m1=new MainMethod();
		m1.test();

	}

}
