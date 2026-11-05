// Name: Saras Verma
// Roll No: 2510303458
// Assignment 11 - Question 1

package Assignment11.Question1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}