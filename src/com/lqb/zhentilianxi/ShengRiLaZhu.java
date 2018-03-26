package com.lqb.zhentilianxi;

/**
 * created by cier on 2018/3/26 10:10
 */
public class ShengRiLaZhu {
    public static void main(String[] args) {
        int i;
        out:
        for( i= 1;;i++){
            for (int j = i;;j++){
                if(num(i,j)==236){
                    System.out.println(i);
                    break out;
                }
                if(num(i,j)>236){
                    break;
                }
            }
        }
    }

    public static int num(int m, int n) {
        return (m+n)*(n-m+1)/2;
    }
}
