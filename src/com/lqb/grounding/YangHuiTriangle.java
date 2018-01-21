package com.lqb.grounding;

import java.util.Scanner;

public class YangHuiTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] array = new int[n][n];
		
		if(n==1) {
			System.out.println(1);
		}else if(n==2) {
			System.out.println(1);
			System.out.print(1+" "+1);
		}else {
			array[0][0] = 1;
			array[1][0] = 1;
			array[1][1] = 1;
			for(int i=2;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(j==0||j==n) {
						array[i][j]=1;
					}else {
						array[i][j]=array[i-1][j-1]+array[i-1][j];
					}
				}
			}
			for(int i = 0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					if(array[i][j]!=0) {
						System.out.print(array[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	}
}
