package gcd;

public class FindGCD {

    public static int gcd_solve(int num1, int num2) {
        int gcd = 0;
        int maxNum = Math.max(num1, num2);
        int minNum = Math.min(num1, num2);
        for (int i = 1; i <= minNum; i++)
            if (maxNum % i == 0 & minNum % i == 0) {
                gcd = i;
            }
        return gcd;
    }

}
