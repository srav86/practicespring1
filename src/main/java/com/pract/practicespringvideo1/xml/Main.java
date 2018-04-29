package com.pract.practicespringvideo1.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private Shape shape1;
	private Shape shape2;
	
	
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Main(Shape shape1, Shape shape2) {
		super();
		this.shape1 = shape1;
		this.shape2 = shape2;
	}
	public Shape getShape1() {
		return shape1;
	}
	public void setShape1(Shape shape1) {
		this.shape1 = shape1;
	}
	public Shape getShape2() {
		return shape2;
	}
	public void setShape2(Shape shape2) {
		this.shape2 = shape2;
	}
	
	public void test(){
		shape1.drawshape();
		shape2.drawshape();
	}

	public static void main(String[] args){
		
		//bootstrapping spring or starting spring in application
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Main m=ac.getBean(Main.class);
		m.test();
		((ClassPathXmlApplicationContext)ac).close();
		
	}
}
