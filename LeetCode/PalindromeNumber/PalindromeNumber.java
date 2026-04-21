package LeetCode.PalindromeNumber;

//https://leetcode.com/problems/palindrome-number/ Completed
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int tempNumber = x, result = 0;
        while (tempNumber > 0) {
            result++;
            tempNumber = tempNumber / 10;
        }
        tempNumber = x;
        int tempNumber1 = 0;
        while (tempNumber > 0) {
            int reminder = tempNumber % 10;
            int tempr = 1;
            for (int i = 0; i < result - 1; i++) {
                tempr = tempr * 10;
            }
            tempNumber1 = tempNumber1 + (reminder * tempr);
            result--;
            tempNumber /= 10;
        }
        if (tempNumber1 != x) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(1001));
        System.out.println(palindromeNumber.isPalindrome(-121));
        System.out.println(palindromeNumber.isPalindrome(10));
    }
}
