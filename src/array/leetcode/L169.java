package array.leetcode;

import java.util.HashMap;

/**
 * #169
 * https://leetcode-cn.com/problems/majority-element/
 * <p>
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class L169 {
    public static void main(String[] args) {
        L169 o = new L169();
        int[] source = {2, 2, 1, 1, 1, 2, 2, 2};
        int res = o.majorityElement(source);
        System.out.println(res);
    }

    // 暴力解法
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                int size = hashMap.get(nums[i]);
                size += 1;
                hashMap.put(nums[i], size);
                if (size >= nums.length / 2) {
                    res = nums[i];
                    break;
                }
            } else {
                hashMap.put(nums[i], 0);
            }
        }
        return res;
    }

    // 摩尔投票法
    public int majorityElement1(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        int countFlag=0;
        int result = 0;
        for(int i=0;i<nums.length;i++)
        {
            //初次默认第一个。后续每次判断当countFlag为0，意味着之前元素抵消完成。
            if(countFlag==0){
                //赋值新元素作为即将可能要返回的值
                result=nums[i];
            }
            // 即将可能返回的值给当前比，相等+1，不相等-1，累计为0重新赋值新坐标元素。
            countFlag+=(result==nums[i])?1:-1;
        }
        return result;
    }

}
