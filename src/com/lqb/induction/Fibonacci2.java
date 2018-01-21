package com.lqb.induction;
import java.util.Scanner;
/**
 * 使用递归会使时间复杂度爆炸，系统会提示超时
 * @author cier
 *
 */
public class Fibonacci2 {
	public static int F[] = new int[1000001];
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		System.out.println(getNum(n));
	}
	public static int getNum(int n) {
		if(n==1||n==2) {
			F[1] = 1;
			F[2] = 1;
		}else {
			int num = getNum(n-1)+getNum(n-2);
			F[n] = num%10007;
		}
		return F[n];
	}
}
