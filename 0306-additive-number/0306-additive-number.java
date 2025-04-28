import java.math.BigInteger;
public class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            String first = num.substring(0, i);
            if (first.length() > 1 && first.charAt(0) == '0') continue;
            for (int j = i + 1; j < n; j++) {
                String second = num.substring(i, j);
                if (second.length() > 1 && second.charAt(0) == '0') continue;
                if (isValid(j, first, second, num)) return true;
            }
        }
        return false;
    }
    
    private boolean isValid(int start, String first, String second, String num) {
        if (start == num.length()) return true;
        BigInteger a = new BigInteger(first);
        BigInteger b = new BigInteger(second);
        BigInteger sum = a.add(b);
        String sumStr = sum.toString();
        if (num.length() - start < sumStr.length()) return false;
        String next = num.substring(start, start + sumStr.length());
        if (!next.equals(sumStr)) return false;
        return isValid(start + sumStr.length(), second, sumStr, num);
    }
}
