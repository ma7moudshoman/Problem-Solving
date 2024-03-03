package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class ColorStone {

    public static  void main(String []args){
        Scanner input =new Scanner( (System.in));

        /*
        RGB
        RRR
         */

        String value=input.next();
        String instraction=input.next();
        int x=0;
        int counter=1;
        for (int i=0;i<instraction.length();i++){
            if (value.toCharArray()[x]==instraction.toCharArray()[i]){
                counter++;
                x++;
            }
        }

        System.out.println(counter);

    }
}
