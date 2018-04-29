package com.pract.practicespringvideo1.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.pract.practicespringvideo1.javaconfig" })
public class ShapeConfiguration {

	// @Bean
	// public Circle getcirclee(){
	// return new Circle();
	// }
	//
	// @Bean
	// public Triangle gettriangleee(){
	// return new Triangle();
	// }
	//
	// @Bean
	// public Main getmainn(){
	// return new Main(getcirclee(),gettriangleee());
	// }
	//

}
