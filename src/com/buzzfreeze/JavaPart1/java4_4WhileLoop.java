package com.buzzfreeze.JavaPart1;

public class java4_4WhileLoop {

	public static void main(String[] args) {
//		Lab 6
//		1.�ʴ���� i ������ͺ �¡�û�С�ȵ���� i ����㹡�ùѺ����͹䢢ͧ 
//		while ����ҡ i ���¡���������ҡѺ 10 while ( i <= 10 ) �ʴ���� i �͡�� 
//		�����ͺ ( i �դ�����������1)
		int i = 0;
		while (i <= 10) {
			System.out.println("Counter" + i);
			i++;
		}

//		2.���ҧ������Ҽ�����ͧ����Ţ 1 �֧ 10
		int sum = 0;
		for (int counter = 0; counter <= 10; counter++) {
			sum += counter;
		}
		System.out.println("sum = " + sum);

//		3.���ҧ������Ҥ�������ҧ 1-100 ������12 ŧ���
		i = 0;
		while (i <= 100) {
			if (i % 12 == 0) {
				System.out.println(i + "��� 12 ŧ���");
			}
			i++;
		}

//		4.����С�� array ����դ��[1,2,3,4,5] ������ foreach 㹡��ǹ loop ���� print ����͡�ҷ�����Lab 6. � Ҿ�����ѹ While Loop

		int myArray[] = { 1, 2, 3, 4, 5 };
		for (int counter : myArray) {
			System.out.println("Counter :" + counter);
		}

//		Lab 7   (�. ��� �͡����ͧ�� do while)
//		1. print ��ҵ���Ţ 20 ��������ҡ�ҡ仹���
		int counter = 20;
		String str = "" ;
		do {
			str = str + " " + Integer.toString(counter);
			counter--;
		} while (counter >= 1);
		
		System.out.println(str);
//		2.��¹�������Ǩ�ͺ����Ţ����繨�ҹǹ������ͨ�ҹǹ�����������з�ҧҹ��ٻ����������ҡ���ѧ����͡�Ţ������ҡ�͡�Ţ�����繡���͡�ҡ�ٻ

//		Lab 8
//		1.���˹������ count �����Ѻ�Ѻ��ҹǹ�ͺ 
//		a.count ������鹷��0 ���仨����20 (��� 20 ����)
//		b.��� count �դ���� 11 ������break ���� if �з�ҧҹ 
//		c.����ʴ���� 11 ����͡�ҡ loop ������Ҥ����觴�ҹ��ҧ���
		
		int count = 0;
		while (count <= 20) {
			if (count == 11) {
				System.out.println(count);
				break;
			}
			count++;
		}
		

		

//		for (int counter = 0; counter <= 10; counter++) {
//			System.out.println("Counter :" + counter);
//		}
//
//		int myArray[] = { 1, 2, 3, 4, 5 };
//		for (int counter : myArray) {
//			System.out.println("Counter :" + counter);
//		}
//
//		int counter = 0;
//		while (counter < 5) {
//			System.out.println("Counter" + counter);
//			counter++;
//		}

	}
}
