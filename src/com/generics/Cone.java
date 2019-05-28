package com.generics;
/*
 * 泛型类声明：
 * class 泛型类名<泛型列表> {
 * 		类体
 * }
 */

/*泛型类中的泛型对象只能调用Objct类中的方法；故重写了Object类的toString()方法*/
class Cone<E> {
	E bottom;
	double height;
	public Cone(E b) {
		bottom = b;
	}
	
	public void computeVolume() {
		String s = bottom.toString();
		double area = Double.parseDouble(s);
		System.out.println("体积是" + 1.0/3.0 * area * height);
	}

}
