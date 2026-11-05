// Name: Saras Verma
// Roll No: 2510303458
// Assignment 11 - Question 3

package Assignment11.Question3;
public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                }
            }
        }

        System.out.println("Swaps: " + swaps);
    }
}