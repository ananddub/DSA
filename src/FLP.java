public class FLP {
    int binary(final int[] nums, final int target, boolean fsearch) {
        int ans = -1;
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] > target) end = mid - 1;
            else if (nums[mid] < target) st = mid + 1;
            else {
                ans = mid;
                if (fsearch) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int st = binary(nums, target, true);
        int end = -1;
        if (st != -1)
            end = binary(nums, target, false);
        return new int[]{st, end};
    }
}
