// Name: Saras Verma
// Roll No: 2510303458
// Assignment 12 - Question 3

package Assignment12.Question3;
public class Main {
    public static void main(String[] args) {

        int[] arr = {6, 5, 4, 3, 2, 1};
        int shifts = 0;

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shifts++;
            }

            arr[j + 1] = key;
        }

        System.out.println("Shifts: " + shifts);
    }
}
