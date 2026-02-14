package Test;

public class FindMax {

    /**
     * This method should return the largest number in the passed in array.
     *
     * Constraints:
     * 1 <= nums.length <= 100
     * -10000 <= nums[i] <= 10000
     *
     * @param nums An array containing integers.
     * @return The largest number in nums.
     */
    public static int findMax(int[] nums) {
        // Write your solution here.
        int i;
        int maxNum = nums[0];
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum){
                maxNum = nums[i];
            }
        }
        return maxNum;
    }
}
