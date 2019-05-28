package com.generics;

class Rctangle3 {
	double sideA, sideB, area;
	Rctangle3(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public String toString() {
		area = sideA * sideB;
		return "" + area;
	}

}
