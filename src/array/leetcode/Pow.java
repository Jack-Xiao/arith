package array.leetcode;

/**
 * #50 https://leetcode-cn.com/problems/powx-n/
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */
public class Pow {

    public static void main(String[] args) {
//        pow(2.1, 3);

        double result = myPow1(2, 4);
        System.out.println(result);
    }

    //1. 暴力方法 O(N)
    public static void pow(double x, int n) {

        if (n == 0) {
            return;
        }
        double result = 1L;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println(result);
    }

    //2. 分支算法 O(logN)
    public static double myPow(double x, int n) {
        double res = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                res *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / res : res;
    }

    static double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = fastPow(x, n / 2);
        System.out.println("当前的是为n:" + half);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    static double myPow1(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

}
