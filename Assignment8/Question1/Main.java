// Name: Saras Verma
// Roll No: 2510303458
// Assignment 8 - Question 1

package Assignment8.Question1;
public class Main {
    public static void main(String[] args) {

        int[][] m = new int[3][4];
        int num = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = num++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}