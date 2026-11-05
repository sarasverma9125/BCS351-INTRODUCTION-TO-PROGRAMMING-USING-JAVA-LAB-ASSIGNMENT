ASSIGNMENT 7

1. Experiment Title

Counting Steps and Complexity

2. Aim

To count the steps a program takes and write its time complexity as a comment.

3. Software / Tools Required

- Java Development Kit (JDK 27)
- Visual Studio Code
- Windows Operating System

4. Theory

Time complexity describes how the number of steps performed by an algorithm changes as the input size increases.

A single loop generally has linear time complexity O(n). Nested loops generally have quadratic time complexity O(n²). When a value is repeatedly divided by 2, the time complexity is logarithmic O(log n).

Counting steps helps us understand how much work a program performs.

5. Algorithm / Procedure

Question 1: Count Steps Using One Loop

1. Initialize a variable steps to 0.
2. Run a for loop from 1 to 10.
3. Increase steps by 1 during each iteration.
4. Print the total number of steps.

Question 2: Count Steps Using Nested Loops

1. Initialize a variable steps to 0.
2. Use two nested for loops, each running from 1 to 10.
3. Increase steps by 1 inside the inner loop.
4. Print the total number of steps.

Question 3: Count Halving Steps

1. Store 1024 in an integer variable n.
2. Initialize steps to 0.
3. Use a while loop that runs until n becomes 1.
4. Divide n by 2 and increase steps by 1 in each iteration.
5. Print the total number of halving steps.

6. Input

Question 1: Loop runs from 1 to 10.

Question 2: Both loops run from 1 to 10.

Question 3: Initial value of n is 1024.

7. Output

Question 1: Count Steps Using One Loop

    Steps: 10

Question 2: Count Steps Using Nested Loops

    Steps: 100

Question 3: Count Halving Steps

    Halving steps: 10

8. Result

Successfully counted program execution steps using single loops, nested loops, and repeated halving. Also studied their time complexities: O(n), O(n²), and O(log n).