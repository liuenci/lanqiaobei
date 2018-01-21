package com.lqb.grounding;

public class NumberOfPalindromes {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		for(int i=1000;i<10000;i++) {
			a=i/1000;
			b=i/100%10;
			c=i/10%10;
			d=i%10;
			if(a==d&&b==c) {
				System.out.println(i);
			}
		}
	}
}
