package com.generics;
/*
 * ������������
 * class ��������<�����б�> {
 * 		����
 * }
 */

/*�������еķ��Ͷ���ֻ�ܵ���Objct���еķ���������д��Object���toString()����*/
class Cone<E> {
	E bottom;
	double height;
	public Cone(E b) {
		bottom = b;
	}
	
	public void computeVolume() {
		String s = bottom.toString();
		double area = Double.parseDouble(s);
		System.out.println("�����" + 1.0/3.0 * area * height);
	}

}
