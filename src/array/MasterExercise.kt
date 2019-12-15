package array

import java.util.*

fun main() {
    val nums = intArrayOf(1, 3, 5, 6, 8, 7, 3, 0, 5)
    val target = 0
    exercise2(nums)
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

/**
 *
 * 设置 所有元素倒置
 *
  */
fun exercise2(nums: IntArray) {
    var temp = 0
    for ( i in 0 until nums.size/2) {
        temp = nums[i]
        nums[i] = nums[nums.size - i -1]
        nums[nums.size -i - 1] = temp
    }
    System.out.println(Arrays.toString(nums))
}


fun execise3(nums: IntArray){

}


class MasterExercise {


}