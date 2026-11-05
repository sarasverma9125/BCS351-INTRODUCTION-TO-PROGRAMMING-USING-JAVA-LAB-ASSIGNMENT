// Name: Saras Verma
// Roll No: 2510303458
// Assignment 4 - Question 2

package Assignment4.Question2;
public class Main {

    static int fact(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args) {

        System.out.println("5P2 = " + nPr(5, 2));

    }
}
