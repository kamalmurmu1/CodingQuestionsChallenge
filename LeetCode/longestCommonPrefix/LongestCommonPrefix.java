package LeetCode.longestCommonPrefix;

// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int pointer = 0, i = 0;
        char temp;
        if (strs[0].length() > 0) {
            temp = strs[0].charAt(pointer);
        } else {
            return result;
        }
        while (pointer != -1) {
            if (strs[i].length() - 1 < pointer) {
                break;
            }
            if (strs[i].charAt(pointer) != temp) {
                break;
            }
            if (i == strs.length - 1) {
                i = 0;
                result = result + temp;
                pointer++;
                if (pointer < strs[0].length()) {
                    temp = strs[0].charAt(pointer);
                } else {
                    pointer = -1;
                }
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"hj", "op", "p"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
