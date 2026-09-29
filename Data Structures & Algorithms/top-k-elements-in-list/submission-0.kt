class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>() // int - count
        for(num in nums) {
            if(map.containsKey(num)) {
                map[num] = map.getValue(num) + 1
            }
            else {
                map.put(num,1)
            }
        }
        return map.entries
        .sortedByDescending { it.value }
        .take(k)
        .map {it.key}
        .toIntArray()

    }
}
