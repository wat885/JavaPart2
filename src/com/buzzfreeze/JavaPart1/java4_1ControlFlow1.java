package com.buzzfreeze.JavaPart1;

public class java4_1ControlFlow1 {

	public static void main(String[] args) {

//		Lab 4
		// 1 ��С�ȵ���� score = ���á��� a.��� score >= 80 ��� print ��� Goodb.��� score >= 50 ����¡��� 80 ��� print ��� normal c.��� score < 50 ��� print ��� fail
		int score = 50;
		if (score >= 80) {
			System.out.println("Good");
		} else if (score >= 50 && score < 80) {
			System.out.println("normal");
		} else if (score < 50) {
			System.out.println("fail");
		}

		// 2 �ҡ��� 1 ����С�ȵ���� boolean ��� isHandSome ����������繤�����á���a.��⨷��ҡ ��� 2 ����Դ isHandSome = true ���� �����Ҩ��� score ������� ��� print Good ��ʹ
		boolean isHandsome = true;
		if (isHandsome == true) {
			System.out.println("Good");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			} else if (score >= 50 && score < 80) {
				System.out.println("normal");
			} else if (score < 50) {
				System.out.println("fail");
			}
		}

	}
}
