package com.lqb.grounding;

import java.util.Scanner;

public class FindAnInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = input.nextInt();
		}
		int integer = input.nextInt();
		int flag = -1;
		for(int i=0;i<n;i++) {
			if(num[i]==integer) {
				flag = i+1;
				break;
			}
		}
		System.out.println(flag);
	}
}
