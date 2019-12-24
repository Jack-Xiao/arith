package array.leetcode

fun main() {
    val num = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)


}

fun maxSum(nums: IntArray) {
    val result = mutableListOf<Int>()
    var rResult = 0
    var lastResult = 0
    for (i in nums.indices) {
        if (nums[i] > 0) {
            if (result.size == 0) {
                rResult = 0;
            }
            rResult += nums[i]
            result.add(i)
        } else if (nums[i] <= 0) {
            if (result.size == 0) {
                rResult == 0
            } else {

            }
        }
    }
}