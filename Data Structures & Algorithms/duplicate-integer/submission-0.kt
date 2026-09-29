class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        var duplicated = false
        for(num in nums) {
            val inserted = set.add(num)
            if(!inserted) {
                duplicated = true
                break
            }
        }
        return duplicated
    }
}
