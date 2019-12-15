package array

import java.util.*
import kotlin.collections.HashMap

fun main() {
    val nums = intArrayOf(3, 2, 4)
    val target = 6
    val i = twoSum(nums, target)
    System.out.println(Arrays.toString(i))
}
//自己的实现
//fun twoSum(nums: IntArray, target: Int): IntArray {
//    nums.forEachIndexed { index1, i1 ->
//        nums.forEachIndexed { index2, i2 ->
//            if (index1 != index2 && (i1 + i2) == target) {
//                return intArrayOf(index1, index2)
//            }
//        }
//    }
//    return intArrayOf(-1,-1)
//}
//
// 稍微优化的实现
//fun twoSum(nums: IntArray, target: Int): IntArray {
//    val indexArr = IntArray(2)
//
//    for (i in 0 until nums.size) {
//        if (i == nums.size - 1) {
//            break
//        }
//
//
//        val iNum = nums[i]
//        for (j in i+1 until nums.size){
//            if(iNum + nums[j] == target){
//                indexArr[0] = i
//                indexArr[1] = j
//                break
//            }
//        }
//    }
//    return intArrayOf(-1, -1)
//}
//
//次优解 hashmap实现
fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexArr = IntArray(2)
    val map = HashMap<Int,Int>()
    for (i in nums.indices) {
        if(map.containsKey(target - nums[i])){
            indexArr[0]= map[target - nums[i]]!!
            indexArr[1] = i
            break
        }
        map.put(nums[i],i)
    }
    return indexArr
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index1, i1 ->
            nums.forEachIndexed { index2, i2 ->
                if ((i1 + i2) == target) {
                    return intArrayOf(index1, index2)
                }
            }
        }
        return intArrayOf()
    }
}
//
//class Solution {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        nums.forEachIndexed { index1, i1 ->
//            nums.forEachIndexed { index2, i2 ->
//                if ((i1 + i2) == target) {
//                    return intArrayOf(index1, index2)
//                }
//            }
//        }
//        return intArrayOf()
//    }
//
//
//    fun test() {
//        val nums = intArrayOf(3, 2, 4)
//        val target = 6
//        twoSum(nums, target)
//    }
//
//
//
//}
