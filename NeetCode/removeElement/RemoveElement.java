package NeetCode.validate_parentheses.removeElement;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
                k++;
            } else {
                nums[i] = -1;
            }
        }
        return k;
    }
}