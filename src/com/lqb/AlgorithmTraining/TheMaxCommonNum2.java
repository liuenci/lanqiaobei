package com.lqb.AlgorithmTraining;

import java.util.Scanner;

public class TheMaxCommonNum2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long result1 = n*(n-1)*(n-2);
		long result2 = n*(n-1)*(n-3);
		long result3 = (n-1)*(n-2)*(n-3);
		if(n==1) {
			System.out.println(1);
		}else {
			if(n==2) {
				System.out.println(2);
			}else {
				if(n%2!=0) {
					System.out.println(result1);
				}else if(n%3!=0) {
					System.out.println(result2);
				}else {
					System.out.println(result3);
				}
			}
		}
	}
}
