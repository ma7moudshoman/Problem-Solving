package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int upper = 0;
        int lower = 0;

        for (Character c : word.toCharArray()) {

            if (Character.isLowerCase(c)) {
                lower++;
            } else
                upper++;
        }
        if ((upper > lower)) {
            System.out.println(word.toUpperCase());
        } else
            System.out.println(word.toLowerCase());
    }
}

