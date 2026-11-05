// Name: Saras Verma
// Roll No: 2510303458
// Assignment 9 - Question 2

package Assignment9.Question2;
public class Main {
    public static void main(String[] args) {

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum = sum + m[i][j];
            }

            System.out.println("Column " + (j + 1) + " sum: " + sum);
        }
    }
}
