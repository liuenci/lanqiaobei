package com.lqb.AlgorithmTraining;

import java.util.Scanner;

public class IntervalKLargeQuery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		for(int i = 0;i<n;i++) {
			num[i] = input.nextInt();
		}
		int m = input.nextInt();
		int[] mint = new int[m];
		// 保存每行输入的三个数
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i = 0;i<m;i++) {
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			mint[i] = search(a, b, c, num);
		}
		for(int i = 0;i<m;i++) {
			System.out.println(mint[i]);
		}
		input.close();
	}
	public static int search(int a,int b,int c,int[] num) {
		// 提取数组,长度正确
		int[] subNum = new int[b+1-a];
		// 赋值
		for(int i = 0;i<subNum.length;i++) {
			subNum[i] = num[a++-1];
		}
		for(int i = 1;i<subNum.length;i++) {
			for(int j = 0;j<subNum.length-i;j++) {
				if(subNum[j]<subNum[j+1]) {
					int temp = subNum[j];
					subNum[j] = subNum[j+1];
					subNum[j+1] = temp;
				}
			}
		}
		return subNum[c-1];
	}
}
