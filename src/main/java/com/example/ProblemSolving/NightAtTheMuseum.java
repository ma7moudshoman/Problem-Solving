package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class NightAtTheMuseum {

    public static void main(String []args) {


        Scanner input = new Scanner(System.in);
        int start = 97;
        int moves=0;
        String value=input.next();
        for (int i=0;i<value.length();i++){
            int result=Math.abs(value.toCharArray()[i]-start);
            if (result<=13){
                moves+=result;
            }else {
                moves+=(26-result);
            }
start=value.toCharArray()[i];
        }

        System.out.println(moves);




    }


}
