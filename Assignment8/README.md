ASSIGNMENT 8

1. Experiment Title

Matrices: Transpose and Row Sums

2. Aim

To create two-dimensional arrays, visit them row by row, and build a new matrix from one.

3. Software / Tools Required

- Java Development Kit (JDK 27)
- Visual Studio Code
- Windows Operating System

4. Theory

A two-dimensional array in Java stores data in rows and columns. It is also called a matrix. Each element is accessed using two indexes: one for the row and one for the column.

Nested loops are used to traverse matrix elements. A transpose exchanges the rows and columns of a matrix. Row sums are calculated by adding all elements in each row.

5. Algorithm / Procedure

Question 1: Create and Print a Matrix

1. Create a 3×4 integer matrix.
2. Initialize a variable value to 1.
3. Use nested loops to fill the matrix with values from 1 to 12, row by row.
4. Use nested loops to print the matrix.

Question 2: Find the Transpose of a Matrix

1. Create a 3×3 matrix containing values from 1 to 9.
2. Create another 3×3 matrix for the transpose.
3. Use nested loops to exchange rows and columns.
4. Store each element using transpose[j][i] = m[i][j].
5. Print the transposed matrix.

Question 3: Calculate the Sum of Each Row

1. Create a 3×3 matrix containing values from 1 to 9.
2. Traverse each row using an outer loop.
3. Initialize sum to 0 for each row.
4. Use an inner loop to add all elements of that row.
5. Print the sum of each row.

6. Input

Question 1: A 3×4 matrix filled with values 1