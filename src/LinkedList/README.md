# Linked List - DSA Practice
## Problems Solved

---

### 1. Reverse Linked List
Approach: Iterative (Three Pointers)
* Idea: Use prev, curr, and next pointers to reverse links while traversing the list
* Time Complexity: O(n)
* Space Complexity: O(1)

---

### 2. Merge Two Sorted Lists

Approach 1: Iterative (Dummy Node)
* Idea: Use a dummy node and compare nodes from both lists, attaching the smaller one each time to build a sorted list
* Time Complexity: O(n + m)
* Space Complexity: O(1)

Approach 2: Recursive
* Idea: Compare current nodes and recursively merge the remaining lists by linking the smaller node
* Time Complexity: O(n + m)
* Space Complexity: O(n + m) (recursion stack)

---

### 3. Delete Nth Node From End of List

* Approach: Two Pointers (Fast & Slow)
* Idea: Move fast pointer n steps ahead, then move both fast and slow together until fast reaches end; slow will be at node before the one to delete
* Time Complexity: O(n)
* Space Complexity: O(1)

---
### 4. Detect Cycle in Linked List

* Approach: Floyd’s Cycle Detection (Fast & Slow Pointers)
* Idea: Move slow pointer one step and fast pointer two steps; if they meet at any point, a cycle exists
* Time Complexity: O(n)
* Space Complexity: O(1)

---