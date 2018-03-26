package com.lqb.zhentilianxi;

/**
 * created by cier on 2018/3/26 9:24
 */
public class MeiQiuShuMu {
    /**
     * 1 1
     * 2 3
     * 3 6
     * 4 10
     */
    public static void main(String[] args) {
        int count = 0;
        int num;
        for (int i = 1; i <= 100; i++) {
            num = (1+i)*i/2;
            count += num;
        }
        System.out.println(count);
    }
}
