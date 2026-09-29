class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) {
            return false
        }
        var isAnagram = true
        val map1 = createMap(s)
        val map2 = createMap(t)
        return map1 == map2
        
    }
    fun createMap(s: String): Map<Char,Int> {
        val map = mutableMapOf<Char, Int>()
        for(c in s) {
            if(map.containsKey(c)) {
                val count = map.getValue(c)
                map[c] = count + 1
            }
            else {
                map.put(c,1)
            }
        }
        return map
    }
}
