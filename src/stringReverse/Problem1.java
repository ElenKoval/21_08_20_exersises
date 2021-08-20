package stringReverse;


public class Problem1 {

    public static String solve(String str) {
        String res = "";
        if (str != null) {
            for (int i = str.length() - 1; i >= 0; i--) {
                res = res + str.charAt(i);
            }
        } else {
            res=null;
        }
        return res;
    }
}