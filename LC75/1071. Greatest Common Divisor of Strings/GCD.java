public class GCD {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCD sol = new GCD();
        System.out.println(sol.gcdOfStrings("ABCABC", "ABC")); // Output: "ABC"
        System.out.println(sol.gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(sol.gcdOfStrings("LEET", "CODE"));   // Output: ""
    }
}
