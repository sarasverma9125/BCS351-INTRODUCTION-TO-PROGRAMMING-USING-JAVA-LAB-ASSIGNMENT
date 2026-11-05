// Name: Saras Verma
// Roll No: 2510303458
// Assignment 5 - Question 2

package Assignment5.Question2;
public class Main {
    public static void main(String[] args) {

        int arr[] = {12, 45, 7, 33, 21};

        int sum = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}
