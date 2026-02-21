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