package com.pract.practicespringvideo1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Autowired
	@Qualifier("triangle")
	private Shape shape1;
	@Autowired
	@Qualifier("circle")
	private Shape shape2;
	
	@Autowired
	private ShapeCreator shapecre;

	// public Main() {
	// super();
	// // TODO Auto-generated constructor stub
	// }
	//
	// public Main(Shape shape1, Shape shape2) {
	// super();
	// this.shape1 = shape1;
	// this.shape2 = shape2;
	// }
//	public Shape getShape1() {
//		return shape1;
//	}

//	public void setShape1(Shape shape1) {
//		this.shape1 = shape1;
//	}
//
//	public Shape getShape2() {
//		return shape2;
//	}
//
//	public void setShape2(Shape shape2) {
//		this.shape2 = shape2;
//	}

	public void test() {
		shape1.drawshape();
		shape2.drawshape();
		shapecre.createtest();
	}

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ShapeConfiguration.class);
		Main m = ac.getBean(Main.class);
		m.test();
		((AnnotationConfigApplicationContext) ac).close();

	}
}
