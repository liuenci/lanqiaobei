package com.lqb.grounding;
import java.util.Scanner;
public class AlphabeticGraphics {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);  
        int n=input.nextInt();  
        int m=input.nextInt();  
        for(int i=1;i<=n;i++){  
            for(int j=1;j<=m;j++){  
                char s=(char)(Math.abs(i-j)+'A');  
                System.out.print(s);  
            }  
            System.out.println();  
        }         
	}
}
