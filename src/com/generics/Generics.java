package com.generics;

public class Generics {

	public static void main(String[] args) {
		Circle3 circle = new Circle3(10);
		//�÷�������������ʱ������ָ������ʹ�õķ��͵ľ�������
		Cone<Circle3> oneCone = new Cone<Circle3>(circle);	
		oneCone.height = 10;
		oneCone.computeVolume();
		
		Rctangle3 rectangle = new Rctangle3(10, 5);
		//����ʵ������ʱ���þ������������
		Cone<Rctangle3> anotherCone = new Cone<Rctangle3>(rectangle);
		anotherCone.height = 30;
		anotherCone.computeVolume();
	}

}
