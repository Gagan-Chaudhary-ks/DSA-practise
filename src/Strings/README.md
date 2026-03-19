# Strings - DSA Practice

## Problems Solved

---

### 1. Reverse String

* Approach: Two Pointers / StringBuilder
* Idea: Use two indices `start` and `end`, swap characters until they meet OR use built-in reverse method
* Time Complexity: O(n)
* Space Complexity: O(1) (Two Pointers) / O(n) (StringBuilder)

---

### 2. Palindrome (Ignore Case & Spaces)

* Approach: Two Pointers
* Idea: Convert string to lowercase, use two pointers and skip spaces while comparing characters
* Time Complexity: O(n)
* Space Complexity: O(1)

---
### 3. Anagram

* Approach: HashMap / Frequency Array
* Idea: Count frequency of characters in first string and decrement using second string; if any character is missing or frequency becomes negative, not an anagram
* Time Complexity: O(n)
* Space Complexity: O(1) (using array) / O(n) (using HashMap)