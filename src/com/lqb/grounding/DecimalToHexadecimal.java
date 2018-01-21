package com.lqb.grounding;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		char[] c = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int a = num/16;
		int b = num%16;
		for(int i=0;i<c.length;i++) {
			if(b==i) {
				System.out.println(String.valueOf(a)+c[i]);
			}
		}*/
		System.out.println(Integer.toHexString(new Scanner(System.in).nextInt()).toUpperCase());
	}
}
