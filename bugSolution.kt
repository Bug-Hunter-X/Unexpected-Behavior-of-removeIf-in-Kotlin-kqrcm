fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(list) // Output: [1, 2, 3, 4, 5] 
    println(newList) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }.toSet()
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 2]

    // Using filter creates a new collection leaving the original unchanged
    // This is safer when dealing with concurrent modification
} 