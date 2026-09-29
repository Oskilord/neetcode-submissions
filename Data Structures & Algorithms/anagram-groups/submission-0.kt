class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        for(string in strs) {
            val sortedStr = string.toCharArray().sorted().joinToString("")
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, mutableListOf(string))
            }
            else {
                val listStr = map.getValue(sortedStr)
                listStr.add(string)
                map[sortedStr] = listStr
            }
        }
        return map.values.map { it.toList() }
    //     val result = mutableListOf<List<String>>()
    //     val map = mutableMapOf<String, MutableList<String>>()  // "Abc" -> (bac, cba))
    //     for(string in strs) {
    //         val sortedStr1 = string.toCharArray().sorted().joinToString("")
    //         for(secondString in strs) {
    //             val sortedStr2 = secondString.toCharArray().sorted().joinToString("")
    //             if(sortedStr1 == sortedStr2) {
    //                 if(map.containsKey(sortedStr1)) {
    //                     val listStr = map.getValue(sortedStr1)
    //                     listStr.add(secondString)
    //                     map[sortedStr1] = listStr
    //                 }
    //                 else {
    //                     if(string != secondString) {
    //                         map.put(sortedStr1,mutableListOf(string, secondString))
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return map.values.map { it.toList() }
    // }
    }
}
