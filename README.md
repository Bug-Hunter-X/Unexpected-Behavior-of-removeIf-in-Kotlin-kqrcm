# Kotlin removeIf Unexpected Behavior

This repository demonstrates an uncommon but potentially problematic aspect of Kotlin's `removeIf` function. The function modifies the collection directly, which might lead to unexpected side effects if not carefully managed, particularly in scenarios involving concurrent access or multiple references to the same collection.  The example showcases the function's behavior with both `MutableList` and `MutableSet` and highlights how this in-place modification can cause issues.

## Solution

The solution provides safer alternatives that create a new collection instead of modifying the original, thereby avoiding potential concurrency problems and unexpected behavior.