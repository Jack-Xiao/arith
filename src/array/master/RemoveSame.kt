package array.master

import java.util.*

/**
 * Created by xiaojiang on 2019/12/18.
 * 数据结构考研 线性表课后题
 *
 *
 */

fun main(args: Array<String>) {
    var nums = intArrayOf(1, 1, 3, 4, 5, 6, 7, 9, 9, 0, 1, 3, 6)
    var nums1 = intArrayOf(10,11,12,34,1)
    val list = nums.toMutableList()
    val target = 1
//    removeSameNum(list, target)
//    removeBetweenNum(list, 1, 7)
//    removeRepeatNum(nums.toMutableList(), target)

//    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
//    val nums1 = intArrayOf(6, 7, 8, 9, 10, 11, 11)
//    mergeSeqArray


//    exchangeNum(nums.toMutableList(), 3)
//    mergeSeqArray()

}

//#3 删除线性表中所有值为x 的数据元素
fun removeSameNum(nums: MutableList<Int>, target: Int) {
    for (i in nums.size - 1 downTo 0) {
        if (target == nums[i]) {
            nums.removeAt(i)
        }
    }
    System.out.println(Arrays.toString(nums.toIntArray()))
}

//#4 删除s t之间的值
fun removeBetweenNum(nums: MutableList<Int>, s: Int, t: Int) {
    if (s > t) {
        throw Exception("数据错误")
    }
    for (i in nums.size - 1 downTo 0) {
        if (s < nums[i] && t > nums[i]) {
            nums.removeAt(i)
        }
    }
    System.out.println(Arrays.toString(nums.toIntArray()))
}

//#5 有序顺序表 删除 s t之间的值
fun removeBetweenNum1(nums: MutableList<Int>, s: Int, t: Int) {
    if (s > t) {
        throw Exception("数据错误")
    }
    for (i in nums.size - 1 downTo 0) {
        if (s < nums[i] && t > nums[i]) {
            nums.removeAt(i)
        }
    }

    System.out.println(Arrays.toString(nums.toIntArray()))
}

//#6 删除重复的值
fun removeRepeatNum(nums: MutableList<Int>, target: Int) {
    val hash = HashMap<Int, Int>()
    for (i in nums.size - 1 downTo 0) {
        if (hash.containsKey(nums[i])) {
            nums.removeAt(i)
        } else {
            hash.put(nums[i], i)
        }
    }
    System.out.println(Arrays.toString(nums.toIntArray()))
}

//#7 将两个有序顺序表合并为一个
fun mergeSeqArray(nums: MutableList<Int>, nums1: MutableList<Int>, result: MutableList<Int>) {
    val result = mutableListOf<Int>()
//
//    var i = 0
//    nums.forEach { value1 ->
//        if (value1 < nums1[i]) {
//            result.add(value1)
//        } else if (value1 > nums1[i]) {
//            result.add(nums1[i])
//            if (nums1.size - 1 > i) {
//                i++
//            }
//        } else {
//            result.add(value1)
//            if (nums1.size - 1 > i) {
//                i++
//            }
//        }
//    }
//
//    if (i < nums1.size) {
//        for (j in IntRange(i + 1, nums1.size)) {
//            result.add(nums1[j])
//        }
//    }
    var i = 0;
    var j = 0;
    var k = 0;
    while (i < nums.size && j < nums1.size) {
        if (nums[i] <= nums1[j]) {
            result[k++] = nums[i++]
        } else {
            result[k++] = nums1[i++]
        }
    }
    while (i<nums.size){
        result[k++] = nums[i++]
    }
    while (j<nums1.size){
        result[k++] = nums1[j++]
    }

    println(nums.toIntArray().contentToString())
    println(nums1.toIntArray().contentToString())
    println(result.toIntArray().contentToString())
}

//#8 以为数组中， 依次存放两个线性表,（a1,a2,a3）(b1,b2,b3)，将两顺序表位置调换
//1. 先全部逆置、
//2.




//#9 设将n(n > 1)个整数存放到一维数组R中。


//#10 设将n(n>1)

// break: 没做出来 时间复杂度为O(n), 空间复杂度为O(1)
fun exchangeNum(nums: MutableList<Int>, target: Int) {
    val temp = 0

    for (i in 0 until nums.size - target) {
        val index = getIndex(i, target, nums.size)
        nums[i] = nums[index]
        if (0 < target) {

        }
        System.out.println(("当前变换数值i $i :${Arrays.toString(nums.toIntArray())}"))
    }
}

private fun getIndex(index: Int, p: Int, size: Int): Int {
    var resultIndex = -1
    if (index + p <= size - 1) {
        resultIndex = index + p
    } else {
        val total = index + p
        resultIndex = total - size
    }
    return resultIndex
}






