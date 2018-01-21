package com.lqb.grounding;

import java.util.Scanner;

public class NumberOfFeatures {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		for(int i= 0;i<n;i++) {
			num[i] = input.nextInt();
		}
		int max = num[0];
		int min = num[n-1];
		int count = 0;
		for(int i=0;i<n;i++) {
			if(num[i]>max) {
				max = num[i];
			}
			if(num[i]<min) {
				min = num[i];
			}
			count+=num[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(count);
	}
}
