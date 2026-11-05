ASSIGNMENT 13 – STRINGS: METHODS AND PALINDROMES

1. Experiment Title

Strings: Methods and Palindromes

2. Aim

To perform different string operations in Java, reverse a string, check whether a string is a palindrome, and generate all possible substrings of a given string.

3. Software / Tools Required

- Java Development Kit (JDK 27)
- Visual Studio Code
- Windows Operating System

4. Theory

A String in Java is a sequence of characters. Java provides various built-in methods to perform string operations.

Some commonly used String methods are:

- length() – Returns the length of a string.
- indexOf() – Finds the position of a character.
- toUpperCase() – Converts a string into uppercase.
- charAt() – Returns the character at a specified index.
- equals() – Compares two strings.

A palindrome is a word that reads the same forward and backward.

A substring is a part of a given string.

5. Algorithm / Procedure

Question 1: String Methods

1. Initialize a string with the value "Programming".
2. Find and display the length of the string.
3. Find the first position of character 'g' using indexOf().
4. Convert the string into uppercase using toUpperCase().
5. Display the results.

Question 2: Reverse a String

1. Initialize a string with the value "Java".
2. Create an empty string to store the reversed string.
3. Use a loop starting from the last character.
4. Access each character using charAt().
5. Add each character to the reversed string.
6. Display the reversed string.

Question 3: Palindrome Check

1. Initialize a string with the value "racecar".
2. Create an empty string to store its reverse.
3. Reverse the string using a loop and charAt().
4. Compare the original and reversed strings using equals().
5. Display whether the string is a palindrome or not.

Question 4: Print All Substrings

1. Initialize a string with the value "abc".
2. Use two nested loops to select starting and ending positions.
3. Generate substrings using the substring() method.
4. Display all possible substrings.

6. Input

Question 1

    String: Programming

Question 2

    String: Java

Question 3

    String: racecar

Question 4

    String: abc

7. Output

Question 1

    Length: 11
    First g position: 3
    Uppercase: PROGRAMMING

Question 2

    Reversed: avaJ

Question 3

    racecar is a palindrome

Question 4

    a
    ab
    abc
    b
    bc
    c

8. Result

All four Java programs were successfully executed. Different String methods were used, strings were reversed, palindrome checking was performed, and all possible substrings of the given string were generated successfully.