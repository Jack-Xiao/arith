package array

import java.util.*

fun main() {
    val nums = intArrayOf(1, 3, 5, 6, 8, 7, 3, 0, 5)
    val target = 0
    exercise1(nums)
//    val r = searchInsert(nums, target)
//    System.out.println(r)
//    System.out.println(Arrays.toString(i))
}

/**
 * 练习1， 查最小的那个元素，并用最后的一个元素替换。
 */
fun exercise1(nums: IntArray) {
    var mixValue = -1
    var mixInt = -1
    mixValue = nums[0]
    for (i in nums.indices) {
        if (mixValue > nums[i]) {
            mixValue = nums[i]
            mixInt = i
        }
    }
    nums[mixInt] = nums[nums.size - 1]
    System.out.println(mixValue)
    System.out.println(Arrays.toString(nums))
}

class MasterExercise {


}