package com.lqb.grounding;
import java.util.Scanner;
public class JudgeLeapYear {
	public static void main(String[] args) {
		int year = new Scanner(System.in).nextInt();
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
