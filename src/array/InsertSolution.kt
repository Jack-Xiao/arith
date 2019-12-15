package array

import java.util.*

fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 0
    val r = searchInsert(nums, target)
    System.out.println(r)
//    System.out.println(Arrays.toString(i))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var result = 0
    for (i in 0 until nums.size) {
        if (nums[i] < target) {
            result = i + 1
        } else if (nums[i] == target) {
            result = i
            break
        } else if (nums[i] > target) {
            result = i
            break
        }
    }
    return result
}