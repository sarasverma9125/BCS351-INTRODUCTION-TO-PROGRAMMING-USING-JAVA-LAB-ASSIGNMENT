// Name: Saras Verma
// Roll No: 2510303458
// Assignment 6 - Question 3

package Assignment6.Question3;
public class Main {
    public static void main(String[] args) {

        int arr[] = {4, 9, 2, 9, 7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Repeated value: " + arr[i]);
                }
            }
        }
    }
}
