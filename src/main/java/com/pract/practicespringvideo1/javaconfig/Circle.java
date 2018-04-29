package com.pract.practicespringvideo1.javaconfig;

import org.springframework.stereotype.Component;

//@Component
@Component("circle")
public class Circle implements Shape{

	@Override
	public void drawshape() {
		System.out.println("draw circle");
		
	}

}
