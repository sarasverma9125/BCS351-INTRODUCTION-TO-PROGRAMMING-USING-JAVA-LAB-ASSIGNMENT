// Name: Saras Verma
// Roll No: 2510303458
// Assignment 6 - Question 2


package Assignment6.Question2;
public class Main {
    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 8, 3, 4};

        int smallest = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }

        System.out.println("Smallest: " + smallest + " at index " + index);
    }
}
