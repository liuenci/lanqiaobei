package com.lqb.induction;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateCircle {
	public static void main(String[] args) {
		int r = new Scanner(System.in).nextInt();
		System.out.println(new DecimalFormat("#.0000000").format(r*r*Math.PI));
	}
}
