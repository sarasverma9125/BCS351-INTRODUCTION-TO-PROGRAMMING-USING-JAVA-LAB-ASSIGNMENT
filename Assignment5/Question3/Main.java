// Name: Saras Verma
// Roll No: 2510303458
// Assignment 5 - Question 3

package Assignment5.Question3;
public class Main {
    public static void main(String[] args) {

        int arr[] = {5, 12, 2, 14, 7};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count greater than 10: " + count);
    }
}
