package codePractice;//https://leetcode.com/problems/add-binary/


public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        int l = a.length() - b.length();
        String s = "";
        if (l != 0) {
            for (int i = 0; i < Math.abs(l); i++) {
                s = s + "0";
            }
        }
        if (a.length() > b.length()) b = s + b;
        else a = s + a;


        String ans = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.println(a.charAt(i) + "   " + b.charAt(i));
            if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 1) {
                ans = "1" + ans;
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1' && carry == 0) {
                ans = "0" + ans;
                carry = 1;
            } else if ((a.charAt(i) == '1' || b.charAt(i) == '1') && carry == 0) {
                ans = "1" + ans;
            } else if ((a.charAt(i) == '1' || b.charAt(i) == '1') && carry == 1) {
                ans = "0" + ans;
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0' && carry == 1) {
                ans = "1" + ans;
                carry = 0;
            } else
                ans = "0" + ans;
        }

        if (carry == 1) ans = "1" + ans;
        return ans;
    }

    public static void main(String[] args) {

    }
}
