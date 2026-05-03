package LeetCode.lengthoflastword;
// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String resultStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && resultStr.length() > 0) {
                break;
            } else {
                if (s.charAt(i) != ' ') {
                    resultStr += s.charAt(i);
                }
            }
        }
        return resultStr.length();
    }
}
