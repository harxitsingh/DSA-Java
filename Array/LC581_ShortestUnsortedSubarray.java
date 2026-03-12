public class LC581_ShortestUnsortedSubarray {

    public static int findUnsortedSubarray(int[] nums) {

        int n = nums.length;
        int left = -1;
        int right = -1;

        int max = nums[0];
        int min = nums[n - 1];

        // Left → Right traversal
        for (int i = 1; i < n; i++) {

            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }
        }

        // Right → Left traversal
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] > min) {
                left = i;
            } else {
                min = nums[i];
            }
        }

        if (right == -1) {
            return 0;
        }

        return right - left + 1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 6, 4, 8, 10, 9, 15};

        int result = findUnsortedSubarray(nums);

        System.out.println("Length of shortest unsorted subarray: " + result);
    }
}
