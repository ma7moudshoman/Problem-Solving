

package com.example.proplem_solving;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = "qwertyuiopasdfghjklzxcvbnm,./";    // Keyboard
        String s2;    // typeText
        // String s3;   //.....
        char LR;


        s1 = input.next();
        s2 = input.next();
        LR = input.next().charAt(0);
        StringBuilder result = new StringBuilder();

        // s3="";


        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            int index = s1.indexOf(currentChar);   //s2.charAt(i)

            if (LR == 'R') {
                result.append(s1.charAt((index + 1 ) % s1.length()));
                // s3+= s1.charAt(index-1);
            } else if (LR == 'L' ) {
                result.append(s1.charAt((index+s1.length() - 1 ) % s1.length()));
                //     s3 += s1.charAt(index + 1);
            }
        }

        System.out.println(result.toString());
    }

    }


