package com.lqb.grounding;

import java.util.Scanner;

public class SpecialPalindromes {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 10000;i<100000;i++) {
			a = i/10000;
			b = i/1000%10;
			c = i/100%10;
			d = i/10%10;
			e = i%10;
			if(a==e&&b==d&&(a+b+c+d+e)==num) {
				System.out.println(i);
			}
		}
		for(int i = 100000;i<1000000;i++) {
			a = i/100000;
			b = i/10000%10;
			c = i/1000%10;
			d = i/100%10;
			e = i/10%10;
			f = i%10;
			if(a==f&&b==e&&c==d&&(a+b+c+d+e+f)==num) {
				System.out.println(i);
			}
		}
	}
}
