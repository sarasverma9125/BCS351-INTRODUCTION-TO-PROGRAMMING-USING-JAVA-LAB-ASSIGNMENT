// Name: Saras Verma
// Roll No: 2510303458
// Assignment 14 - Question 1

package Assignment14.Question1;
public class Main {
    public static void main(String[] args) {

        String word = "programming";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}
