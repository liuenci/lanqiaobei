package com.lqb.grounding;

public class SpecialNumber {

	public static void main(String[] args) {
		int a =0;
		int b = 0;
		int c = 0;
		for(int i =100;i<=999;i++) {
			a = i/100;
			b = i%100/10;
			c = i %10;
			if(a*a*a+b*b*b+c*c*c==i) {
				System.out.println(i);
			}
		}
	}
}
