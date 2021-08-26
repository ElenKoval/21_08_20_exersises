package stringUpperLowerCase;

public class UpperToLowerCase {
    public static void main(String[] args) {
        System.out.println(changeUpperLower("1234MaM"));
    }

    public static String changeUpperLower(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                res += Character.toUpperCase(str.charAt(i));
            } else {
                Character.toLowerCase(str.charAt(i));
                res += Character.toLowerCase(str.charAt(i));
            }
        }
        return res;
    }

}
