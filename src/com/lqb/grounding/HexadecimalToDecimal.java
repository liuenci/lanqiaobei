package com.lqb.grounding;

import java.util.Scanner;

public class HexadecimalToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char[] c = str.toCharArray();
		int n = 0;
		long num = 0;
		while (n < c.length) {
			char d = c[n];
			switch (d) {
			case 'A':
				num += 10 * Math.pow(16, c.length - 1 - n);
				break;
			case 'B':
				num += 11 * Math.pow(16, c.length - 1 - n);
				break;
			case 'C':
				num += 12 * Math.pow(16, c.length - 1 - n);
				break;
			case 'D':
				num += 13 * Math.pow(16, c.length - 1 - n);
				break;
			case 'E':
				num += 14 * Math.pow(16, c.length - 1 - n);
				break;
			case 'F':
				num += 15 * Math.pow(16, c.length - 1 - n);
				break;
			default:
				String e = String.valueOf(d);
				int f = Integer.parseInt(e);
				num += f * Math.pow(16, c.length -1- n);
				break;
			}
			n++;
		}
		System.out.println(num);
	}
}
