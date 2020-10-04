package com.melody.classes;

import com.melody.shapes.AreaInterface;
import com.melody.shapes.Dot;

public class Triangle extends Dot implements AreaInterface {
	
	private int width;
	private int height;
	
	public Triangle( int w, int h) {
		this.setHeight(h);
		this.setWidth(w);
	}
	

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	
}
