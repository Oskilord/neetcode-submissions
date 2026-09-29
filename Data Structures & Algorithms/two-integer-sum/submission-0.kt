class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mapValueIndex = mutableMapOf<Int,Int>()
        for((index,num) in nums.withIndex()) {
            val numberToSearch = target - num
            if (mapValueIndex.containsKey(numberToSearch)) {
                return intArrayOf(mapValueIndex.getValue(numberToSearch),index)
            }
            mapValueIndex[num] = index
        }
        return intArrayOf(0,0)
    }
}
