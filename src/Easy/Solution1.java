package Easy;

import java.util.HashMap;

/**
 * ClassName: 1.Two Sum
 * Description:
 * date: 2019-06-24 21:27
 *
 * @author cmc
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        //O(n^2)
        //Runtime: 50 ms, faster than 7.64% of Java online submissions for Two Sum.
        //Memory Usage: 37.2 MB, less than 99.62% of Java online submissions for Two Sum.
//        for(int i=0; i < nums.length; i++) {
//            for(int j=0; j < nums.length; j++) {
//                if(j == i) {
//                    continue;
//                }
//                int sum = nums[i] + nums[j];
//                if(sum == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }

        //O(n)
        //Runtime: 2 ms, faster than 98.99% of Java online submissions for Two Sum.
        //Memory Usage: 38.3 MB, less than 90.71% of Java online submissions for Two Sum.
        HashMap<Integer, Integer> tracker = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
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

