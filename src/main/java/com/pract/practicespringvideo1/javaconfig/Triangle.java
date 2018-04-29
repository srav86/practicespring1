package com.pract.practicespringvideo1.javaconfig;

import org.springframework.stereotype.Component;

//@Component
@Component("triangle")
public class Triangle implements Shape{

	@Override
	public void drawshape() {
		System.out.println("draw triangle");
		
	}

}
