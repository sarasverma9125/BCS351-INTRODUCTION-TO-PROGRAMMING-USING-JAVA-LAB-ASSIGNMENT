ASSIGNMENT 15 – STRINGBUILDER METHODS

1. Experiment Title

StringBuilder Methods

2. Aim

To perform different string operations using the StringBuilder class in Java, including appending text, appending numbers, deleting characters, and inserting text at a specified index.

3. Software / Tools Required

- Java Development Kit (JDK 27)
- Visual Studio Code
- Windows Operating System

4. Theory

StringBuilder is a class in Java used to create and modify mutable strings. Unlike String, StringBuilder allows changes to the same object without creating a new object every time.

Some commonly used StringBuilder methods are:

- append() – Adds text or numbers at the end.
- insert() – Inserts text at a specified position.
- deleteCharAt() – Removes a character at a specified index.
- length() – Returns the length of the string.

5. Algorithm / Procedure

Question 1: Append Text

1. Create a StringBuilder object with the value "Hello".
2. Use the append() method to add " World".
3. Display the updated string.
4. Display the length of the string.

Question 2: Append Numbers and Remove Last Comma

1. Create an empty StringBuilder object.
2. Use a loop from 1 to 5.
3. Append each number followed by a comma.
4. Use deleteCharAt() to remove the last comma.
5. Display the final string.

Question 3: Insert Text at Index 0

1. Create a StringBuilder object with the value "Java".
2. Use the insert() method to insert "Hello " at index 0.
3. Display the updated string.

6. Input

Question 1

    Initial String: Hello
    Text to append: World

Question 2

    Numbers: 1, 2, 3, 4, 5

Question 3

    Initial String: Java
    Text to insert: Hello
    Index: 0

7. Output

Question 1

    String: Hello World
    Length: 11

Question 2

    1,2,3,4,5

Question 3

    Hello Java

8. Result

All three Java programs were successfully executed. StringBuilder methods were used to append text, append numbers, remove the last comma, and insert text at a specified index successfully.