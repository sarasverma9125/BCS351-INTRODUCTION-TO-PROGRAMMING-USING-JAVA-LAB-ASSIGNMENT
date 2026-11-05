ASSIGNMENT 6

1. Experiment Title

Arrays: Reverse and Duplicates

2. Aim

To print an array in reverse order, find the smallest value, and check an array for repeated values.

3. Software / Tools Required

- Java Development Kit (JDK 27)
- Visual Studio Code
- Windows Operating System

4. Theory

Arrays in Java store multiple values of the same data type. Each element can be accessed using its index, starting from 0.

Loops help us traverse arrays in different ways. A reverse loop prints elements from the last index to the first. We can also compare elements to find the smallest value and use nested loops to identify duplicate values.

5. Algorithm / Procedure

Question 1: Print Array in Reverse Order

1. Create an integer array containing 10, 20, 30, 40, and 50.
2. Start a for loop from the last index of the array.
3. Decrease the index until it reaches 0.
4. Print each element.

Question 2: Find Smallest Value and Its Index

1. Create an integer array containing 2, 5, 1, 8, 3, and 4.
2. Initialize the smallest value with the first element and index with 0.
3. Traverse the array using a for loop.
4. Compare each element with the smallest value.
5. Update the smallest value and its index when a smaller element is found.
6. Print the smallest value and its index.

Question 3: Find Repeated Value

1. Create an integer array containing 4, 9, 2, 9, and 7.
2. Use nested loops to compare array elements.
3. If two elements are equal, print the repeated value.
4. Stop checking after finding a repeated value.
5. If no repeated value is found, print an appropriate message.

6. Input

Question 1: Array values are 10, 20, 30, 40, 50.

Question 2: Array values are 2, 5, 1, 8, 3, 4.

Question 3: Array values are 4, 9, 2, 9, 7.

7. Output

Question 1: Print Array in Reverse Order

    50
    40
    30
    20
    10

Question 2: Find Smallest Value and Its Index

    Smallest: 1 at index 2

Question 3: Find Repeated Value

    Repeated value: 9

8. Result

Successfully printed an array in reverse order, found the smallest element and its index, and identified a repeated value using nested loops.