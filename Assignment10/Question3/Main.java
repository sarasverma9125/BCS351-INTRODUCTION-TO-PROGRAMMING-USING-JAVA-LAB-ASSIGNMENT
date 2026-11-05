// Name: Saras Verma
// Roll No: 2510303458
// Assignment 10 - Question 3

package Assignment10.Question3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Update element at index 1
        list.set(1, 25);

        // Remove element at index 3
        list.remove(3);

        System.out.println("Updated List: " + list);
        System.out.println("Size: " + list.size());
    }
}
