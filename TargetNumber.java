class TargetNumber {
    public void twoSum(int[] nums, int target) {
        // int[] result = {};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("indexing is : " + i + " " + j);
                    // return new int[] { i, j };
                    break;
                }
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 4 };
        int target = 6;
        // Solution s = new Solution();
        TargetNumber t = new TargetNumber();
        t.twoSum(arr, target);
    }
}