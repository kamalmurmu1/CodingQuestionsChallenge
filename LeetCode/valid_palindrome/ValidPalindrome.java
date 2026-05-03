package LeetCode.valid_palindrome;

// https://leetcode.com/problems/valid-palindrome/submissions/1993799380/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String k1 = "";
        s = s.toLowerCase();
        for (int k = 0; k < s.length(); k++) {
            if ((s.charAt(k) >= 'a' && s.charAt(k) <= 'z')
                    || (s.charAt(k) >= '0' && s.charAt(k) <= '9')) {
                k1 += s.charAt(k);
            }
        }
        int i = 0, j = k1.length() - 1;
        while (i < j) {
            if (k1.charAt(i) != k1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
