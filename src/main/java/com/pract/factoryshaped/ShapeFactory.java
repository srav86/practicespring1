package com.pract.factoryshaped;

public class ShapeFactory {
	static Triangle t=new Triangle();
	static Circle c=new Circle();
	public static Shape getshape(String shape){
		
		if (shape.equals("Circle")){
		return c;}
		else if(shape.equals("Triangle")){
			return t;
		}
		return null;
		
	}

}
