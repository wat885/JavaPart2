package com.buzzfreeze.JavaPart2;

public class java7 {
	public static void main(String[] args) {
//		Lab 12 ???˹? String ??繴ѧ?
		String String1 = "You and Me";
		String String2 = " you and me ";

		// 1 ???ͧ????º???º String 2 String ?????繤??????ǡѹ???????
		if (String1.equals(String2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");			// Not equal
		//2 ????????觤???Ҥ????String ????ʴ???ҷ??????Һ?˹?Ҩ?
		String check = "you";
		System.out.println(String2.contains(check));	// true
		//3 ??????????Ҥ?????ǢͧString ????????ʴ???Ҥ??????String
		System.out.println(String2.length());			// 12
		//4 ????????觵Ѵ??ͤ??????͵ѴString ????˹觷??1-4 ?͡
		System.out.println(String1.substring(1, 5));	// ou a
		//5 ????????觵Ѵ??ͧ??ҧ?ͧ????¤
		System.out.println(String2.trim());				// you and me
		//6 ????????觵Ѵ??ͧ??ҧ?ͧ????¤
		System.out.println(String2.toUpperCase());		//  YOU AND ME
		//7
		System.out.println(String2.trim().toUpperCase()); // YOU AND ME
	}
}
