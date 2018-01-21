package com.lqb.AlgorithmTraining;

import java.util.Scanner;

public class UppercaseToLowercase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char c  = input.next().charAt(0);
		input.close();
		System.out.println((char)(c+32));
	}
}
