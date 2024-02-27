package src.main.java.com.example.ProblemSolving;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OnTheOtherHoof {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        Set<Integer>colors=new HashSet();

        colors.add(input.nextInt());
        colors.add(input.nextInt());
        colors.add(input.nextInt());
        colors.add(input.nextInt());

        System.out.println(4-colors.size());

    }


}
