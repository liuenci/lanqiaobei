package com.lqb.induction;
import java.util.Scanner;
/**
 * ����ѭ����ʱ�临�Ӷ�Ϊn�����ᳬʱ
 * @author cier
 *
 */
public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int n = new Scanner(System.in).nextInt();
        for (int i=3; i<=n; i++){
            int t = f2;
            f2 = (f1 + f2) % 10007;
            f1 = t;
        }
        System.out.println(f2);
    }
}
