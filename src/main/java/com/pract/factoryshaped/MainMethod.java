package com.pract.factoryshaped;

public class MainMethod {
	
	Shape s=ShapeFactory.getshape("Triangle");
	Shape s1=ShapeFactory.getshape("Circle");
//	Shape s=new Triangle();
//	Shape s1=new Circle();
//	
	public void test(){
		s1.drawshape();
		s.drawshape();
		
	}
	public static void main(String[] args) {
		MainMethod m1=new MainMethod();
		m1.test();

	}

}
