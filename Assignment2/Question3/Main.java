// Name: Saras Verma
// Roll No: 2510303458
// Assignment 2 - Question 3

package Assignment2.Question3;
class Main {
    public static void main(String[] args) {

        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)) {

            System.out.println("Leap year");

        } else {

            System.out.println("Not a leap year");

        }

    }
}
