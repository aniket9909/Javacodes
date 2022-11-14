class TargetNumber {
    // public void twoSum(int[] nums, int target) {
    // // int[] result = {};
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // System.out.println("indexing is : " + i + " " + j);
    // // return new int[] { i, j };
    // break;
    // }
    // }
    // }

    // }
    public int[] twoSum(int arr[], int target) {
        int temp = 0;
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {

                // if (arr[i] <= target) {
                temp = target - arr[i];
                // } else {
                // continue;
                // }
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[j] == temp) {
                        System.out.println(i + " " + j);
                        return new int[] { i, j };

                    }
                }
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        int arr[] = { -1, -2, -3, -4, -5 };
        int target = -8;
        // Solution s = new Solution();
        TargetNumber t = new TargetNumber();
        for (int i : t.twoSum(arr, target)) {
            System.out.println(i);
        }
    }
}