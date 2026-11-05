// Name: Saras Verma
// Roll No: 2510303458
// Assignment 9 - Question 1

package Assignment9.Question1;
public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");
        for (int j = 0; j < 3; j++) {
            System.out.print(m[0][j] + " ");
        }

        System.out.println();

        System.out.print("Last row: ");
        for (int j = 0; j < 3; j++) {
            System.out.print(m[2][j] + " ");
        }
    }
}