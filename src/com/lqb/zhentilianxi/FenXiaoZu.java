package com.lqb.zhentilianxi;

/**
 * created by cier on 2018/3/26 16:24
 */
public class FenXiaoZu {
    /**
     * @param a
     * @return
     */
    public static String remain(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                s += (char) (i + 'A');
            }
        }
        return s;
    }

    public static void f(String s, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) continue;
            a[i] = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == 1) continue;
                a[j] = 1;
                for (int k = j + 1; k < a.length; k++) {
                    if (a[k] == 1) continue;
                    a[k] = 1;
                    System.out.println(s+" "+(char) (i + 'A')+""+(char) (j + 'A')+""+(char) (k + 'A')+" "+remain(a));  //填空位置
                    a[k] = 0;
                }
                a[j] = 0;
            }
            a[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[9]; // 创建一个九个整形长度的数组
        a[0] = 1; // 数组的第一个值为1

        for (int b = 1; b < a.length; b++) { // b从1到8开始遍历
            a[b] = 1; // 把所有数组中的值变为1
            for (int c = b + 1; c < a.length; c++) { // c从2到8开始遍历
                a[c] = 1; // 将数组中的所有值变为1
                String s = "A" + (char) (b + 'A') + (char) (c + 'A'); // s=ABC
                f(s, a);
                a[c] = 0;
            }
            a[b] = 0;
        }
    }
}
