package src.main.java.com.example.ProblemSolving;
import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);

        int n1, n2, n3;
        n1 = inout.nextInt();
        n2 = inout.nextInt();
        n3 = inout.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Largest number is: " + n1);

            if (n2 >= n3) {
                System.out.println("Smallest number is: " + n3);
            } else {
                System.out.println("Smallest number is: " + n2);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("Largest number is: " + n2);

            if (n1 >= n3) {
                System.out.println("Smallest number is: " + n3);
            } else {
                System.out.println("Smallest number is: " + n1);
            }
        } else {
            System.out.println("Largest number is: " + n3);

            if (n1 >= n2) {
                System.out.println("Smallest number is: " + n2);
            } else {
                System.out.println("Smallest number is: " + n1);
            }
        }
    }
}

