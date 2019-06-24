package Easy;

/**
 * ClassName: 1.Two Sum
 * Description:
 * date: 2019-06-24 21:27
 *
 * @author cmc
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++) {
            for(int j=0; j < nums.length; j++) {
                if(j == i) {
                    continue;
                }
                int sum = nums[i] + nums[j];
                if(sum == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] result = solution1.twoSum(new int[]{2,7,8,9},9);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}

