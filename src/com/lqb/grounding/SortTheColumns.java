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
		// ð������ֻ��Ҫѭ��n-1��
		for(int i = 1;i<n;i++) {
			// ���ѭ��ÿ��ѭ����֮���Ѿ������������ŵ�����ĺ��棬����ֻ��Ҫѭ��n-i����
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
