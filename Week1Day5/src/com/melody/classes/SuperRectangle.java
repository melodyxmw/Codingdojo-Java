package com.melody.classes;

import com.melody.shapes.AreaInterface;
import com.melody.shapes.Rectangle;

public class SuperRectangle extends Rectangle implements AreaInterface {

	public SuperRectangle(int x, int y, int h, int w) {
		super(x, y, h, w);
		// TODO Auto-generated constructor stub
	}
	
	public void superAwesomeArea() {
		System.out.println(this.getArea());
		
	
	}

}
