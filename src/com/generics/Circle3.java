package com.generics;

class Circle3 {
	double area, radius;
	Circle3 (double r) {
		radius = r;
	}
	
	public String toString() {
		area = radius * radius * Math.PI;
		return "" + area;
	}

}
