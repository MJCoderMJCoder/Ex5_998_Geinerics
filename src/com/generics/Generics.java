package com.generics;

public class Generics {

	public static void main(String[] args) {
		Circle3 circle = new Circle3(10);
		//用泛型类声明对象时，必须指定类中使用的泛型的具体类名
		Cone<Circle3> oneCone = new Cone<Circle3>(circle);	
		oneCone.height = 10;
		oneCone.computeVolume();
		
		Rctangle3 rectangle = new Rctangle3(10, 5);
		//创建实例对象时，用具体的类名代替
		Cone<Rctangle3> anotherCone = new Cone<Rctangle3>(rectangle);
		anotherCone.height = 30;
		anotherCone.computeVolume();
	}

}
