package com.buzzfreeze.JavaPart1;

public class java2_2 {
	
	
	public static void main(String [] args) {
//		Lab 2
		//1.��С�� method �������bark ������������method main ����¡ method bark �� method bark ����� local variable ����dogName ����˹�������������á������ǡ����print ��� �The Dog name = xxxbark�
		bark();
		
		//2.����ͧ����¹���primitive ���� print �͡�����������¹�ҡ
		//a.float -> int
		float myF = 5.5f;
		int myI = (int) myF;
		System.out.println(myI);
		//b.int -> float
		float myF2 = (int) myI;
		System.out.println(myF2);
		//c.double -> float 
		double myDouble = 2.2d;
		float myF3 = (float) myDouble;
		System.out.println(myF3);
		//d.char -> int 
		char myChar = '\u0000';
		int myI2 = (int) myChar;
		System.out.println(myI2);
		
		//3.���ͧ��С�� final variable ����hello ����դ�� = �Hello� ���Ǻ�÷Ѵ�Ѵ���ͧ� Assign �������������ù���繤�ғWorld� �����ͧ�� run ���Ǵ�����Դ�â��?

		final String mystring = "Hello";
//		mystring = "World";
		// run ����ҹ���¹��������
		
	}
	
	public static void bark(){
		String dogName = "hiper";
		System.out.println("The Dog name = " + dogName + " bark");
	}

}
