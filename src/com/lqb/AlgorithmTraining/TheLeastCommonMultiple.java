package com.lqb.AlgorithmTraining;

import java.util.Scanner;

public class TheLeastCommonMultiple {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(a*b/num(a,b));
		input.close();
	}
	public static int num(int a,int b) {
		if(a%b==0) {
			return b;
		}else {
			return num(b,a%b);
		}
	}
}
