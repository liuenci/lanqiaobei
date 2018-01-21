package com.lqb.grounding;

import java.util.Scanner;

public class SortTheColumns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		for(int i = 0;i<n;i++) {
			num[i] = input.nextInt();
		}
		// 冒泡排序只需要循环n-1次
		for(int i = 1;i<n;i++) {
			// 外层循环每次循环完之后已经将最大的数字排到数组的后面，所以只需要循环n-i次了
			for(int j = 0;j<n-i;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
