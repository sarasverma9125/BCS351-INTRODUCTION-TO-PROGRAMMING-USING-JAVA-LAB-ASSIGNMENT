// Name: Saras Verma
// Roll No: 2510303458
// Assignment 13 - Question 3

package Assignment13.Question3;
public class Main {
    public static void main(String[] args) {

        String word = "racecar";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
