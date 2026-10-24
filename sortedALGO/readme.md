# Sorting Algorithms — DSA Interview Revision

A collection of fundamental sorting algorithms implemented for learning, practice, and technical interview preparation.

This repository covers **Selection Sort, Bubble Sort, and Insertion Sort**, with their working principles, time complexities, space complexities, and important interview concepts.

## 📚 Table of Contents

- [1. Selection Sort](#1-selection-sort)
- [2. Bubble Sort](#2-bubble-sort)
- [3. Insertion Sort](#3-insertion-sort)
- [4. Complexity Comparison](#4-complexity-comparison)
- [5. Important Interview Questions](#5-important-interview-questions)
- [6. Quick Revision Notes](#6-quick-revision-notes)

---

## 1. Selection Sort

### Concept

Selection Sort repeatedly finds the smallest element from the unsorted portion of an array and places it at the beginning of that portion.

### Example

**Input:** `[64, 25, 12, 22, 11]`

```text
Pass 1: [11, 25, 12, 22, 64]
Pass 2: [11, 12, 25, 22, 64]
Pass 3: [11, 12, 22, 25, 64]
Pass 4: [11, 12, 22, 25, 64]

Sorted: [11, 12, 22, 25, 64]
```

### How it works

1. Assume the first element is the minimum.
2. Search the remaining unsorted elements for a smaller value.
3. Swap the minimum element with the first element of the unsorted portion.
4. Repeat until the array is sorted.

### Complexity Analysis

| Case | Time Complexity | Explanation |
|---|---|---|
| Best | O(n²) | Still scans the unsorted portion on every pass |
| Average | O(n²) | Performs approximately n²/2 comparisons |
| Worst | O(n²) | Performs approximately n²/2 comparisons |
| Auxiliary Space | O(1) | Sorts in place using constant extra space |

### Properties

- **Stable:** No, in its standard swap-based implementation.
- **In-place:** Yes.
- **Adaptive:** No.
- **Best use:** Small arrays when minimizing the number of swaps is useful.

---

## 2. Bubble Sort

### Concept

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

After each complete pass, the largest unsorted element moves to its correct position at the end.

### Example

**Input:** `[5, 1, 4, 2, 8]`

```text
Pass 1: [1, 4, 2, 5, 8]
Pass 2: [1, 2, 4, 5, 8]
Pass 3: [1, 2, 4, 5, 8]

Sorted: [1, 2, 4, 5, 8]
```

### How it works

1. Compare each pair of adjacent elements.
2. Swap them if the left element is greater than the right element.
3. Repeat passes, reducing the unsorted portion each time.
4. If a complete pass makes no swaps, stop early.

### Complexity Analysis

| Case | Time Complexity | Explanation |
|---|---|---|
| Best | O(n) | Already sorted, with an early-exit swap flag |
| Average | O(n²) | Repeated adjacent comparisons and swaps |
| Worst | O(n²) | Reverse-sorted input requires many comparisons and swaps |
| Auxiliary Space | O(1) | Uses constant extra space |

**Important:** Without the early-exit optimization, the standard Bubble Sort implementation has O(n²) best-case time complexity too.

### Properties

- **Stable:** Yes, if equal elements are not swapped.
- **In-place:** Yes.
- **Adaptive:** Yes, with the early-exit optimization.
- **Best use:** Learning sorting fundamentals and handling very small or nearly sorted arrays.

---

## 3. Insertion Sort

### Concept

Insertion Sort builds a sorted portion of the array one element at a time. It takes the next element, called the `key`, shifts larger elements to the right, and inserts the key into its correct position.

It works similarly to arranging playing cards in your hand.

### Example

**Input:** `[5, 3, 4, 1, 2]`

```text
Initial:  [5, 3, 4, 1, 2]
Pass 1:   [3, 5, 4, 1, 2]
Pass 2:   [3, 4, 5, 1, 2]
Pass 3:   [1, 3, 4, 5, 2]
Pass 4:   [1, 2, 3, 4, 5]

Sorted:   [1, 2, 3, 4, 5]
```

### How it works

1. Start from the second element.
2. Store the current element in a variable called `key`.
3. Compare the key with elements in the sorted portion.
4. Shift elements greater than the key one position to the right.
5. Insert the key into its correct position.
6. Continue until all elements are processed.

### Complexity Analysis

| Case | Time Complexity | Explanation |
|---|---|---|
| Best | O(n) | Already sorted; each element needs one comparison |
| Average | O(n²) | Elements generally require multiple comparisons and shifts |
| Worst | O(n²) | Reverse-sorted input requires maximum shifting |
| Auxiliary Space | O(1) | Uses constant extra space |

### Properties

- **Stable:** Yes, if equal elements are not shifted past one another.
- **In-place:** Yes.
- **Adaptive:** Yes.
- **Best use:** Small arrays and nearly sorted data.

---

## 4. Complexity Comparison

| Property | Selection Sort | Bubble Sort | Insertion Sort |
|---|---|---|---|
| Best Time | O(n²) | O(n)* | O(n) |
| Average Time | O(n²) | O(n²) | O(n²) |
| Worst Time | O(n²) | O(n²) | O(n²) |
| Auxiliary Space | O(1) | O(1) | O(1) |
| Stable | No** | Yes | Yes |
| In-place | Yes | Yes | Yes |
| Adaptive | No | Yes* | Yes |
| Main operation | Selecting minimum | Swapping adjacent elements | Shifting elements |

\* Assumes Bubble Sort uses an early-exit swap flag.

\** Standard swap-based Selection Sort is not stable, although stable variants exist.

### Which algorithm should you choose?

- **Selection Sort:** When you want to minimize the number of swaps.
- **Bubble Sort:** When studying adjacent comparisons and basic sorting mechanics.
- **Insertion Sort:** When the array is small or nearly sorted.

For large datasets, efficient algorithms such as Merge Sort, Heap Sort, or Quick Sort are generally more suitable.

---

## 5. Important Interview Questions

### Q1. Why is Selection Sort O(n²) in the best case?

Selection Sort still scans the remaining unsorted elements to find the minimum, even when the input is already sorted. Therefore, its number of comparisons remains quadratic.

### Q2. How can Bubble Sort achieve O(n) best-case time?

Use a Boolean variable such as `swapped`. Set it to `true` whenever a swap occurs. If a complete pass finishes without a swap, terminate the algorithm.

### Q3. Why is Insertion Sort O(n) in the best case?

When the array is already sorted, each new element is compared with its predecessor and no shifting is required. The total work is linear.

### Q4. What does in-place sorting mean?

An in-place sorting algorithm uses constant auxiliary space, O(1), excluding the input array and implementation-specific overhead.

### Q5. What does a stable sorting algorithm mean?

A stable sorting algorithm preserves the relative order of elements with equal keys.

For example, if two records have the same score, their original order remains unchanged after a stable sort.

### Q6. Which of these algorithms is best for nearly sorted arrays?

Insertion Sort is generally an excellent choice because it performs very little shifting when the elements are already close to their correct positions.

Optimized Bubble Sort also benefits from early termination.

### Q7. Which algorithm performs the fewest swaps?

Standard Selection Sort performs at most n − 1 swaps, whereas Bubble Sort can perform O(n²) swaps in the worst case.

### Q8. What is the difference between comparisons and swaps?

- **Comparison:** Checks the relative order of two values.
- **Swap:** Exchanges the positions of two values.
- **Shift:** Moves an element to another position, as in Insertion Sort.

### Q9. Can Insertion Sort be stable?

Yes. Shift elements only when they are strictly greater than the key, not when they are equal.

### Q10. What does O(1) auxiliary space mean?

The algorithm uses a constant amount of additional memory regardless of the input size, such as a few temporary variables.

---

## 6. Quick Revision Notes

Remember these points before an interview:

1. **Selection Sort:** Find the minimum and swap it into place. Best, average, and worst time are all O(n²).
2. **Bubble Sort:** Compare adjacent elements and swap. Optimized best case is O(n).
3. **Insertion Sort:** Take a key, shift larger elements, and insert it. Best case is O(n).
4. All three algorithms can sort in place with O(1) auxiliary space.
5. Standard Selection Sort is not stable; Bubble Sort and Insertion Sort are stable when implemented correctly.
6. Insertion Sort is usually the strongest choice among these three for nearly sorted arrays.
7. Always state your implementation assumptions when explaining complexity in an interview.

### Interview Answer Template

When asked to explain a sorting algorithm, follow this order:

1. Explain the basic idea.
2. Walk through a small example.
3. Explain the best, average, and worst time complexities.
4. State the auxiliary space complexity.
5. Explain stability, in-place behavior, and practical use cases.

---

## Learning Goal

Use this repository to revise sorting fundamentals, strengthen problem-solving skills, and prepare for DSA and software engineering interviews.

**Next topics to learn:** Merge Sort, Quick Sort, Heap Sort, and Counting Sort.
