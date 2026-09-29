class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int left = 0, count = 0, result = 0;

        for (int right = 0; right < nums.length; right++) {
            // if odd
            if (nums[right] % 2 == 1) {
                count++;
            }

            // shrink window if > k odds
            while (count > k) {
                if (nums[left] % 2 == 1) {
                    count--;
                }
                left++;
            }

            // add number of valid subarrays
            result += (right - left + 1);
        }

        return result;
    }
}