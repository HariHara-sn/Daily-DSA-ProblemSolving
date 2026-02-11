#BubbleSort
arr = [5, 3, 1, 4, 2]

for i in range(len(arr)):
    for j in range(i+1, len(arr)):
        if arr[i] > arr[j]:
            arr[i], arr[j] = arr[j], arr[i]


'''
list O(n) and O(n log n) , O(n ^ 2) sorting algorithms:

✅ O(n) Sorting Algorithms

Counting Sort

Radix Sort

Bucket Sort

Pigeonhole Sort

Dutch National Flag Algorithm (special case: 0,1,2)

✅ O(n log n) Sorting Algorithms

Merge Sort

Heap Sort

Quick Sort (average case)

Tim Sort

Intro Sort

Shell Sort (depends on gap sequence, often ~ n log n)

✅ O(n²) Sorting Algorithms

Bubble Sort

Insertion Sort

Selection Sort

Quick Sort (worst case)

Shell Sort (worst case depending on gaps)
'''