# Arrays - DSA Practice

## Problems Solved

---

### 1. Largest Element
- Approach: Single traversal
- Idea: Maintain a variable `largest` and update while iterating
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 2. Second Largest Element (Distinct)
- Approach: Single traversal with two variables (`largest`, `secondLargest`)
- Key Concept:
    - Maintain invariant: `secondLargest < largest`
    - Handle duplicates properly
    - Use flag to avoid sentinel ambiguity
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 3. Reverse Array (In-Place)
- Approach: Two-pointer technique
- Idea:
    - Swap elements from both ends
    - Move inward until pointers meet
- Time Complexity: O(n)
- Space Complexity: O(1)
- Pattern: Two-pointer symmetric swap

---

### 4. Rotate Array Right by 1
- Approach: Store last element, shift elements right
- Idea:
    - Save last element
    - Shift elements from right to left
    - Place saved element at index 0
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 5. Rotate Array Right by K (Reversal Algorithm)
- Approach: Reversal Algorithm (Optimal)
- Steps:
    1. `k = k % n`
    2. Reverse entire array
    3. Reverse first `k` elements
    4. Reverse remaining `n - k` elements
- Time Complexity: O(n)
- Space Complexity: O(1)
- Pattern: Segment Reversal + Index Manipulation

---

### 6. Move Zeroes to End
- Approach: Two-pointer stable compaction
- Idea:
  - Maintain pointer `j` for next non-zero position
  - Traverse array with `i`
  - When `arr[i] != 0`, place it at index `j`
  - Increment `j`
  - Avoid unnecessary swaps when `i == j`
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 7. Remove Duplicates from Sorted Array
- Approach: Two-pointer overwrite technique
- Idea:
  - Maintain pointer `j` for last unique element
  - Traverse array with `i` starting from index 1
  - If `arr[i] != arr[j]`, increment `j` and overwrite
  - Return `j + 1` as new length
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 8. Check if Array is Sorted
- Approach: Single traversal comparison
- Idea:
  - Traverse array once
  - If `arr[i] > arr[i+1]` at any point, return false
  - Otherwise return true
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 9. Check if Array is Sorted and Rotated
- Approach: Circular traversal with break counting
- Idea:
  - Traverse array circularly using `(i+1) % n`
  - Count occurrences where `arr[i] > arr[(i+1) % n]`
  - If count ≤ 1, array is valid sorted + rotated
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 10. Find Missing Number (0 to n) – Summation Method
- Approach: Mathematical summation formula
- Idea:
  - Compute expected sum using `n * (n + 1) / 2`
  - Compute actual sum of array elements
  - Missing number = expectedSum - actualSum
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 11. Find Missing Number (0 to n) – XOR Method
- Approach: Bit manipulation using XOR
- Idea:
  - Initialize `xor = n`
  - Traverse array and apply `xor = xor ^ i ^ arr[i]`
  - Matching numbers cancel out
  - Remaining value is the missing number
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 12. Maximum Consecutive Ones
- Approach: Single traversal with streak counting
- Idea:
  - Maintain `currentCount` for ongoing streak of 1s
  - Reset count when 0 is encountered
  - Update `maxCount` while incrementing
- Time Complexity: O(n)
- Space Complexity: O(1)

---

### 13. Two Sum (HashMap – Optimal)
- Approach: Hashing with complement lookup
- Idea:
  - Traverse array once
  - Compute `complement = target - arr[i]`
  - If complement exists in HashMap, return stored index and current index
  - Otherwise store current element with its index in the map
- Time Complexity: O(n)
- Space Complexity: O(n)

---

### 14. Build Prefix Sum Array
- Approach: Cumulative summation
- Idea:
  - prefix[0] = arr[0]
  - prefix[i] = prefix[i-1] + arr[i]
  - Reuse previous computation instead of recomputing sum
- Time Complexity: O(n)
- Space Complexity: O(n)

---

### 15. Range Sum Query (Prefix Sum)
- Approach: Prefix sum preprocessing
- Idea:
  - First build prefix array where `prefix[i] = arr[0] + ... + arr[i]`
  - For any query from index `L` to `R`:
    - If `L == 0` → sum = `prefix[R]`
    - Otherwise → sum = `prefix[R] - prefix[L-1]`
  - This allows answering range sum queries in constant time
- Time Complexity:
  - Prefix construction: O(n)
  - Each query: O(1)
- Space Complexity: O(n)

---

### 16. Subarray Sum Equals K
- Approach: Prefix Sum + HashMap
- Idea:
    - Maintain a running prefix sum while traversing the array
    - For each element, compute `currSum`
    - Check if `(currSum - k)` exists in the HashMap
    - If it exists, add its frequency to the count
    - Store/update the current prefix sum frequency in the map
    - If prefix sum equals K then do count++
    - Time Complexity: O(n)
- Space Complexity: O(n)

### 17. Longest Subarray with Sum K
- Approach: Prefix Sum + HashMap
- Idea:
  - Maintain running prefix sum
  - If `prefixSum == k`, update max length to `i + 1`
  - Check if `(prefixSum - k)` exists in the map
  - If yes, compute subarray length `i - index`
  - Store the first occurrence of each prefix sum
- Time Complexity: O(n)
- Space Complexity: O(n)